package knou_javatextbook;

class CSuper2 {
	public double x;
	public CSuper2(double new_x) {
		this.x = new_x * 10;
	}
}

class CSub2 extends CSuper2 {
	double x;
	public CSub2(double new_x) {
		super(new_x);
		x = new_x;			
	}
	public double getSuper() {return super.x;}
	public double getSub() {return this.x;}
}

class ThisMyClass{
	double x = 10.0;
	public ThisMyClass() {x = 20.0;}
	public ThisMyClass(double new_x) {
		this(); //����� ���� Ŭ���� �� double x�� �ҷ��´�.
		x = x + new_x;
	}
}

public class ThisTest {
	public static void main(String args[]) {
		ThisMyClass mc = new ThisMyClass(10);
		System.out.println(mc.x);
	}

}
