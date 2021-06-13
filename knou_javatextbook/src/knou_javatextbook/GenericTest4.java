package knou_javatextbook;

class Util {
	public static <K, V> boolean compare(Pair1<K, V> p1, Pair1<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) &&
				p1.getValue().equals(p2.getValue());
	}
}

class Pair1 <K, V> {
	private K key;
	private V value;
	public Pair1(K key, V value) {this.key = key; this.value = value;}
	
	public void setKey(K key) {this.key = key;}
	public void setValue(V value) {this.value = value;}
	public K getKey() {return key;}
	public V getValue() {return value;}
}

public class GenericTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair1 <Integer, String> p1 = new Pair1<>(1, "apple");
		Pair1 <Integer, String> p2 = new Pair1<>(2, "pear");
		boolean same = Util. <Integer, String> compare(p1, p2);
		System.out.println(same);
	}

}
