package knou_javatextbook;

class MyException extends Exception {
	public MyException() {super();}
	public String toString() {return "MyException";}
}

class MyClassEX {
	public void testFunc(int x) throws MyException {
		if (x > 10) throw new MyException();
	}
}


public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassEX mc = new MyClassEX();
		try {
			mc.testFunc(20);
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
