package Prog_4_3;

public class MyStringList {
	int size = 0;
	int init_size=2;
	String[] arr;
	
	public MyStringList() {
		this.arr = new String[init_size];
	}
	public void add (String s) {
		if(size==init_size) {
			resize();
		}
		arr[size] = s;
		size+=1;
	}
	public boolean find(String s) {
		for (String i:arr) {
			if (i.equals(s)) {
				return true;
			}
		}
		return false;
	}
	public boolean remove(String s) {
		int i;
		for (i=0;i<size;i++) {
			if (arr[i].equals(s)) {
				break;
			}
		}
		if (i+1==size) {
			return false;
		}
		for (int j = i;j<size-1;j++) {
			arr[j]=arr[j+1];
			
		}
		arr[size]=null;
		size-=1;
		return true;	
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("["+arr[0]);
		for (int i=1;i<size;i++) {
			s.append(", "+arr[i]);
			
		}
		s.append("]");
		return s.toString();
	}
	public int size() {
		return size;
	}
	private void resize() {
		System.out.println("Resizing....");
		init_size*=2;
		String[] tmp = new String[init_size];
		for (int i=0;i<size;i++) {
			tmp[i] = arr[i];
			
		}
		arr = tmp;
	}
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}
	

}
