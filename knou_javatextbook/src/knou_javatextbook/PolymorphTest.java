package knou_javatextbook;

class A {
	public void func() {System.out.println("a");}
}

class B extends A{
	public void func() {System.out.println("b");}
}

class C extends B{
	public void func() {System.out.println("c");}
}

public class PolymorphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.func();
		a = new C();
		a.func();
		
		B b = new C();
		b.func();
	}

}
