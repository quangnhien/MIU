package lesson7.lab7_2.closedcurve.good;

public class Rectangle extends ClosedCurve implements Polygon{
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		return (width*length);
	}
	public int getNumberOfSides() {
		return 4;
	}
//	public double computePerimeter() {
//		return (width+length)*2;
//	}
	public double[] getArrayOfSides() {
		double[] arr = {width, width,length, length};
		return arr;
	}

}
