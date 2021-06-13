package knou_javatextbook;

class BoxC implements Cloneable {
	private int width, height;
	public BoxC(int w, int h) {width = w; height = h;}
	
	public int width() {return width;}
	public int height() {return height;}
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxC b1 = new BoxC(20, 30);
		BoxC b2 = (BoxC) b1.clone();
		System.out.println(b2.width());
		System.out.println(b2.height());
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
