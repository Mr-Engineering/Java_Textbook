package knou_javatextbook;

public class Electronics {
	private int nVoltage = 0;
	
	// nVoltage = 1; Ŭ���� ���� ��� ������ �ʵ峪 �޼ҵ� ���� �̿��� �ٸ� ��ɹ��� ���� �� ����.
	{nVoltage = 1;} // ��Ͽ� �־�� ǥ�� ����
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
