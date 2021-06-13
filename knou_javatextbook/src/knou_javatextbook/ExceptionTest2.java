package knou_javatextbook;

import java.io.*;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(System.in);
		try {
			int i = dis.readInt();
		} catch (Exception e) {
			System.out.println(e.toString());
			// System.out.println(e.printStackTrace());
		}
	}

}