package knou;

class Cylinder {
	private Circle c;
	private int h;
	
	public Cylinder(Circle a, int b) {
		c = a;
		h = b;
	}
	
	public double getVolume() {
		return c.getArea()*h;
	}

}

