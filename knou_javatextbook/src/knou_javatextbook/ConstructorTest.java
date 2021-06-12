package knou_javatextbook;

class CSuper3 {
	public CSuper3() {System.out.println("super non-argu");}
	public CSuper3(int a) {System.out.println("super argu");}
}

class CSub3 extends CSuper3 {
	public CSub3() {System.out.println("sub non-argu");}
	public CSub3(int a) {System.out.println("sub argu");}
	
}


public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSub3 sub1 = new CSub3();
		CSub3 sub2 = new CSub3(10);
	}

}
