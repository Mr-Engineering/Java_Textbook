package knou_javatextbook;

import java.util.function.*;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer <String> con = t -> System.out.println("Hello" + t);
		con.accept("Java");
	}

}
