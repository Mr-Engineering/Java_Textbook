package knou;

class Circle2 {
	static final double PI = 3.141592;
	public double radius;
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return this.radius * this.radius * PI;
	}
	public void display() {
		System.out.println("������ : " + this.radius + "\n" +
				"���� : " + this.getArea());
	}
}
