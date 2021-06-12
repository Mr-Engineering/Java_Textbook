package knou_javatextbook;

class CSuper {
	private int f1;
	public int f2;
	public void setPrivate() {f1 = 10;}
	public void setPublic() {f2 = 20;}
	private void mPrivate() {f1 = 30;}
}

class CSub extends CSuper {
	private int f3;
	public int f4;
}

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSub sub  = new CSub();
		// sub.f1 = 40; CSuper에서 Private로 정의되어있음
		sub.f2 = 50;
		// sub.f3 = 60; CSub에서 Private로 정의되어있음
		sub.f4 = 70;
		sub.setPrivate();
		sub.setPublic();
		// sub.mPrivate(); CSuper에서 Private로 정의되어있음
	}

}