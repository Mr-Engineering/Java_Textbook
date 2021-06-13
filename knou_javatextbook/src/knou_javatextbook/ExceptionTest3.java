package knou_javatextbook;

import java.io.*;

class CharInput {
	int nInput = 0;
	public char getInput() throws IOException {
		nInput = System.in.read();
		return (char)nInput;
	}
}


public class ExceptionTest3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharInput charInput = new CharInput();
		try {
			System.out.println(charInput.getInput());
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
