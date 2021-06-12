package knou_javatextbook;

class InitMyClass2 {
	public static int nStaticField = 10;
	static void setStaticField(int n) {nStaticField = n;}
	static int getStaticField() {return nStaticField;}
}

public class InitStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitMyClass2 mc = new InitMyClass2();
		mc.setStaticField(20);
		System.out.println(mc.getStaticField());
		InitMyClass2.setStaticField(30);
		System.out.println(InitMyClass2.getStaticField());
		System.out.println(mc.getStaticField());
	}

}