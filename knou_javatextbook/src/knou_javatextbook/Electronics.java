package knou_javatextbook;

public class Electronics {
	private int nVoltage = 0;
	
	// nVoltage = 1; 클래스 정의 블록 내에는 필드나 메소드 정의 이외의 다른 명령문을 넣을 수 없다.
	{nVoltage = 1;} // 블록에 넣어서는 표현 가능
	public void turnOn(int nInputVoltage) {
		nVoltage = nInputVoltage;
	}
	public void turnOff() {nVoltage = 0;}
	public int getVoltage() {return nVoltage;}
	{
	Electronics b = new Electronics();
	int a = b.getVoltage();
	b.turnOn(10);
	}
}
