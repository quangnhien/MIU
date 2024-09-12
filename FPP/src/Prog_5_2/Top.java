public class Top {
	int t = 1;
	Middle mid = this.new Middle();
	Middle.Bottom midbot = this.new Middle().new Bottom();
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement
		return midbot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and 
		//instance vble in Bottom
		int addTopAndBottom() {
			//implement
			return t+midbot.b;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				return t;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}