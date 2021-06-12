package knou_javatextbook;

class CSuper1 {
	public double x;
}

class CSub1 extends CSuper1 {
	public double x;
	public CSub1(double new_x) {
		this.x = new_x;
		super.x = new_x * 10;
	}
	public double getSuper() {return super.x;}
	public double getSub() {return this.x;}
}
public class ThisSuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSub1 sub = new CSub1(10.0);
		System.out.println(sub.x);
		System.out.println(sub.getSub());
		System.out.println(sub.getSuper());
	}

}
