package knou_javatextbook;

class Data1 <T> {
	private T t;
	public void set(T t) { this.t = t;}
	public T get() {return t;}
}

public class GenericsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 <String> data = new Data1 <String> ();
		String i = new String("Hello");
		data.set(i);
		String s = (String) data.get();
	}

}
