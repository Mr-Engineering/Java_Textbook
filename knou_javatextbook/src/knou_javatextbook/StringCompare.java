package knou_javatextbook;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szStr1 = "test";
		String szStr2 = "test";
		if (szStr1 == szStr2)
			System.out.println("szStr1과 szStr2는 같다.");
		else
			System.out.println("szStr1과 szStr2는 다르다.");
		String szStr3 = new String("test");
		String szStr4 = new String("test");
		if (szStr1 == szStr3)
			System.out.println("szStr1과 szStr3는 같다.");
		else
			System.out.println("szStr1과 szStr3는 다르다.");
		
		if (szStr3 == szStr4)
			System.out.println("szStr3과 szStr4는 같다.");
		else
			System.out.println("szStr3과 szStr4는 다르다.");
	}

}
