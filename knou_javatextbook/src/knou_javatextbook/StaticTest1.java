package knou_javatextbook;

class MyClass1 {
	public static int nStaticField = 0;
}

public class StaticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 myObject1, myObject2;
		myObject1 = new MyClass1();
		myObject2 = new MyClass1();
		
		myObject1.nStaticField = 10;
		System.out.println(myObject1.nStaticField);
		myObject2.nStaticField += 10;
		System.out.println(myObject2.nStaticField);
	}

}
