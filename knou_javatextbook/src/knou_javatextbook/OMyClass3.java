package knou_javatextbook;

class OMyClass1 {}

class OMyClass2 extends Object {
	public String toString() {return "This OMyClass2 class";}
}

public class OMyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OMyClass1 my_class1 = new OMyClass1();
		OMyClass2 my_class2 = new OMyClass2();
		System.out.println(my_class1.toString());
		System.out.println(my_class2.toString());
		System.out.println(my_class1);
		System.out.println(my_class2);
	}

}
