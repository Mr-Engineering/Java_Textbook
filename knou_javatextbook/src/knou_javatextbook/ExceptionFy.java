package knou_javatextbook;


public class ExceptionFy {
	public void problem() throws RuntimeException {
		throw new RuntimeException();
	}
	
	public void tryThis() {
		try {
			problem();
			System.out.println("1");
		} catch (RuntimeException x) {
			System.out.println("2");
		} catch (Exception x) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionFy a = new ExceptionFy();
		a.tryThis();
	}

}
