package knou_javatextbook;

interface MyInterface {
	public void method();
}

public class AnonymousTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface sub = new MyInterface() {
			public void method() {System.out.println("sub1");}
		};
		sub.method();
	}

}
