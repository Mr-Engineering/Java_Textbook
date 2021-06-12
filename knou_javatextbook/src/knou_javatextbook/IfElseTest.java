package knou_javatextbook;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		if (n>10) {
			System.out.println("10보다 크다");
		}
		else if (n<3) {
			System.out.println("3보다 작다");
		}
		else {
			System.out.println("3보다 크거나 같고 10보다 작거나 같다.");
		
		}
	}

}
