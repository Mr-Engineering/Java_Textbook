package knou_javatextbook;

interface Movable1 {
	void add(double dx, double dy);
	void sub(double dx, double dy);
	default double change_sign(double v) {return v * (-1.0);}
}

class Point1 implements Movable1 {
	double x, y;
	public void add(double dx, double dy) {x += dx; y += dy;}
	public void sub(double dx, double dy) {x -= dx; y -= dy;}
}

public class DefaultTest {
	public static void main(String args[]) {
		Point1 p = new Point1();
		p.x = 10.5;
		p.y = 11.6;
		System.out.println(p.change_sign(p.x));
	}

}
