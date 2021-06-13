package knou_javatextbook;

interface Figure{
	double getArea();
}

class TriangleIT implements Figure {
	private double height, width;
	public TriangleIT(double h, double w) {height = h; width = w;}
	public double getArea() {return height * width * 0.5;}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleIT t = new TriangleIT(3.0, 4.0);
		System.out.println(t.getArea());
	}

}
