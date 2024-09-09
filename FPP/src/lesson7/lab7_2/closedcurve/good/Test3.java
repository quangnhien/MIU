package lesson7.lab7_2.closedcurve.good;

public class Test3 {
	
	public static void main(String[] args) {

		Polygon[] objects = {
				new Rectangle(3,4),
				new Triangle(4,5,6),
				new Square(3)
				};
		//compute areas
		StringBuilder s = new StringBuilder();
		for(Polygon cc : objects) {
			//System.out.println(String.format("The area of this %s is ", cc.getClass().getSimpleName()) + cc.computeArea());
			s.append("For this " + cc.getClass().getSimpleName()+"\n");
			s.append("Perimeter = " + cc.computePerimeter()+"\n");
		}
		System.out.println(s);
    
	}

}