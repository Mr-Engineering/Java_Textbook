package knou_javatextbook;

class MyClass {
	private int nMyField = 0;
	public void setMyField(int nNewField) {nMyField = nNewField;}
	public int getMyField() {return nMyField;}
}

public class FieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myObject1, myObject2;
		myObject1 = new MyClass();
		myObject2 = new MyClass();
		myObject1.setMyField(10);
		myObject2.setMyField(20);
	}

}
