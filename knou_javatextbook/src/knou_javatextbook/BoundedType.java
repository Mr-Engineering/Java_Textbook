package knou_javatextbook;

class Data3 <T extends Number> {
	private T t;
	public Data3(T t) {this.t = t;}
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}

public class BoundedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data3 <Integer> data = new <Integer> Data3(20);
		System.out.println(data.get());
	}

}
