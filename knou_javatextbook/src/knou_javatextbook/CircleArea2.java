package knou_javatextbook;

class Circle {
	private int r;
	public Circle(int a) {
		r = a;
	}
	public double getArea() {
		return r*r*3.141592;
	}
}

public class CircleArea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		System.out.println(c.getArea());
	}

}
