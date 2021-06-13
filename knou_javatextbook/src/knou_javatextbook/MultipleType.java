package knou_javatextbook;

interface Pair <K,V> {
	public K getKey();
	public V getValue();
}

class OrderedPair <K, V> implements Pair <K,V> {
	private K key;
	private V value;
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {return key;}
	public V getValue() {return value;}
}

public class MultipleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair <String, Integer> p1;
		p1 = new OrderedPair <> ("Even", 8);
		Pair <String, String> p2;
		p2 = new OrderedPair <> ("hello", "java");
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
	}

}
