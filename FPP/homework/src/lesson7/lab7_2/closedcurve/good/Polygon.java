package lesson7.lab7_2.closedcurve.good;

public interface Polygon {
    public int getNumberOfSides();
    public double[] getArrayOfSides(); 
    static double sum(double[] arr) {
    	double s = 0;
    	for (double a:arr) {
    		s+=a;
    	}
    	return s;
    }
    default double computePerimeter() {
    	double[] arr= getArrayOfSides();
    	return sum(arr);
    	
    }

}
