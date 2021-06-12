package knou_javatextbook;

class CSuper4 {
	public CSuper4() {} // CSub4의 매개 변수가 없는 생성자가 있으므로 상속을 하는 CSuper4 역시 매개 변수 없는 생성자가 있어야 함.
	public CSuper4(int a) {System.out.println("super argu");}
}

class CSub4 extends CSuper4 {
	public CSub4() {System.out.println("sub non-argu");}
	public CSub4(int a) {System.out.println("sub argu");}
}

public class ConstructorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSub4 sub1 = new CSub4();
		CSub4 sub2 = new CSub4(10);
	}

}
