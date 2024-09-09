package lesson7.lab7_2.closedcurve.good;

public final class Circle extends ClosedCurve{
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
	public int getNumberOfSides() {
		return 1;
	}
	public double computePerimeter() {
		return Math.PI*radius*2;
	}
}
