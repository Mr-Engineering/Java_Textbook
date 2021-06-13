package knou_javatextbook;

import java.util.function.*;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier <Integer> rand = () -> {
			Integer r = (int)(Math.random()*10);
			return r;
		};
		int a = rand.get();
		System.out.println(a);
	}

}
