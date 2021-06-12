package knou;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 3, 5, 7, 11};
		int b[] = new int[7];
		int anArray4[][] = new int[3][2];
		System.out.println(a[1]);
		System.out.println(anArray4.length);
		System.out.println(b.length);
		
		System.out.println("Cut----Line");
		int twoArray[][] = {{0,1},{10, 11, 12}};
			for (int i = 0; i<twoArray.length; i++)
				for (int j = 0; j<twoArray[i].length; j++)
			System.out.println(twoArray[i][j]);
	}

}
