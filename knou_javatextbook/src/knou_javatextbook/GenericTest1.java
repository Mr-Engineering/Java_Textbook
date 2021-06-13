package knou_javatextbook;

class Data {
	private Object object;
	public void set(Object object) {this.object = object;}
	public Object get() {return object;}
}
public class GenericTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		Integer i = new Integer(20);
		data.set(i);
		String s = (String)data.get();
	}

}
