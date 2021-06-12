package knou_javatextbook;

class MyClass2 {
	public static int nStaticField = 0;
}

public class StaticTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2.nStaticField = 10;
		System.out.println(MyClass2.nStaticField);
	}

}
