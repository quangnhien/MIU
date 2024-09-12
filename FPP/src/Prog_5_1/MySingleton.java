public class MySingleton {
		public static int count = 0;
		private final static MySingleton instance = new MySingleton();
		private MySingleton() {
			count++;
		}
		
		public static MySingleton getInstance() {
			return instance;
		}
		
		public static void main(String[] args) {
			for(int i = 0; i < 10; ++i) {
				MySingleton.getInstance();
			}
			System.out.println(count);
		}
	
	}
