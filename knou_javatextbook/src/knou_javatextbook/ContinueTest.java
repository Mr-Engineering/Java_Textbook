package knou_javatextbook;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nSum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) continue;
			nSum += i;
		}
		System.out.println(nSum);
	}

}
