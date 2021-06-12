package knou_javatextbook;

class OverloadMyClass {
	public int add(int a, int b) {return a+b;}
	public double add(double a, double b) {return a+b;}
}

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMyClass mc = new OverloadMyClass();
		System.out.println(mc.add(10, 15));
		System.out.println(mc.add(10.5, 15.3));
		System.out.println(mc.add(10, 10.5));
	}

}
