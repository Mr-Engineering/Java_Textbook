package knou_javatextbook;

class AnCSuper {
	public int a = 10;
	public void method1() {System.out.println("super1");}
	public void method2() {System.out.println("super2");}
}


public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnCSuper sub = new AnCSuper() {
			public int b = 20;
			public void method1() {System.out.println("sub1");}
			public void method3() {System.out.println("sub3");}
		};
		sub.method1();
		sub.method2();
		System.out.println(sub.a);
		
	}

}
