package knou_javatextbook;

public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nSum = 0;
		int i = 1;
		while(true) {
			nSum += i;
			i++;
			if (i > 10) break;
		}
		System.out.println(i);
	}

}
