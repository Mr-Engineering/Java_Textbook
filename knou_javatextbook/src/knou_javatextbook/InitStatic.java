package knou_javatextbook;

class InitMyClass {
	public static int nStaticField1 = 10;
	public static int nStaticField2;
	public InitMyClass() {nStaticField2 = 20;} // ��ü�� ������ ������ ���� �ʱ�ȭ ��.
}

public class InitStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitMyClass mc1 = new InitMyClass();
		System.out.println("mc1 is constructed");
		System.out.println("nStaticField1 : " + mc1.nStaticField1);
		System.out.println("nStaticField2 : " + mc1.nStaticField2);
		InitMyClass.nStaticField1 += 10;
		InitMyClass.nStaticField2 += 10;
		System.out.println("Values are changed");
		System.out.println("nStaticField1 : " + mc1.nStaticField1);
		System.out.println("nStaticField2 : " + mc1.nStaticField2);
		InitMyClass mc2 = new InitMyClass();
		System.out.println("mc2 is constructed");
		System.out.println("nStaticField1 : " + mc2.nStaticField1);
		System.out.println("nStaticField2 : " + mc2.nStaticField2);
		System.out.println("nStaticField2 : " + mc1.nStaticField2); // mc1�� nStaticField2 ���� �ʱ�ȭ �� ���� Ȯ�ε�.
	}

}
