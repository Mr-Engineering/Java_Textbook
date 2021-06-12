package knou_javatextbook;

class Cylinder {
	private Circle c;
	private int h;
	public Cylinder(Circle a, int b) {
		c = a;
		h = b;
	}
	public double getVolume() {
		return c.getArea() * h;
	}
}

public class CylinderVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7);
		int h = 8;
		Cylinder cy = new Cylinder(c,h);
		System.out.println(cy.getVolume());
	}

}
