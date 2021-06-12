package knou;

public class ThisSuperTest {

	public static void main(String[] args) {
		CSub2 sub = new CSub2(10.0);
		System.out.println(sub.x);
		System.out.println(sub.getSuper());
		System.out.println(sub.getSub());

	}

}
