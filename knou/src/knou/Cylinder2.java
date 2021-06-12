package knou;

public class Cylinder2 extends Circle2 {
	private double height;
	
	public Cylinder2() {
		super();
		height = 1.0;
	}
	public Cylinder2(double radius, double h) {
		super();
		this.height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public double getArea() {
		return 2 * PI * getRadius() * height + 2 * super.getArea(); 
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	public String toString() {
		return "Cylinder of radius = " + getRadius() + "\nHeight = " + height;
	}
	
}
