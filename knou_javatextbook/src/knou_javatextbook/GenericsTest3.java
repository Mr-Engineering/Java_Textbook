package knou_javatextbook;

class Data2 <T> {
	private T t;
	public Data2(T t) {this.t = t;}
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}


public class GenericsTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 data = new Data2("Hello");
		System.out.println(data.get());
	}

}
