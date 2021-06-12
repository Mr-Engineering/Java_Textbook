package knou_javatextbook;

class TV {
	private int nSize = 0;
	public TV(int nNewSize) {nSize = nNewSize;}
	public TV() {nSize = 20;}
}

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV(10);
		TV tv2 = new TV();
	}

}
