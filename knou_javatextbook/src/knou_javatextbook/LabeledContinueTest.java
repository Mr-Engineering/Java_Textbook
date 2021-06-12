package knou_javatextbook;

public class LabeledContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nSum = 0;
		my_loop:
			for(int i = 1; i <= 100; i++) {
				if(i%2 == 0) continue my_loop;
				nSum += i;
			}
		System.out.println(nSum);
	}

}
