package knou;

class Circle {
	public double r;
	static final double PI = 3.141592;
	public Circle(double a) {
		r = a;
	}
	public double getArea() {
		return r * r * PI;
	}
	public double getRadius() {
		return r;
	}
	int [] d = {1,2,3,4,5};
}
