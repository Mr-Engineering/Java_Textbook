package knou_javatextbook;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szStr1 = "test";
		String szStr2 = "test";
		if (szStr1 == szStr2)
			System.out.println("szStr1�� szStr2�� ����.");
		else
			System.out.println("szStr1�� szStr2�� �ٸ���.");
		String szStr3 = new String("test");
		String szStr4 = new String("test");
		if (szStr1 == szStr3)
			System.out.println("szStr1�� szStr3�� ����.");
		else
			System.out.println("szStr1�� szStr3�� �ٸ���.");
		
		if (szStr3 == szStr4)
			System.out.println("szStr3�� szStr4�� ����.");
		else
			System.out.println("szStr3�� szStr4�� �ٸ���.");
	}

}
