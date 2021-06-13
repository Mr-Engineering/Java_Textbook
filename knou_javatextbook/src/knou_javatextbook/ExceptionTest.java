package knou_javatextbook;

import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(System.in);
		try {
			int i = dis.readInt();
		} catch (EOFException e1) {
			System.out.println(e1.toString());
			//System.out.println(e1.printStackTrace());
		} catch (IOException e2) {
			System.out.println(e2.toString());
			//System.out.println(e2.printStackTrace());
		}
	}

}
