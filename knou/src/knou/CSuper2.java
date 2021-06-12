package knou;

class CSuper2 {
	public double x;
}

class CSub2 extends CSuper2 {
	public double x;
	
	public CSub2(double new_x) {
		this.x = new_x;
		super.x = new_x * 10;
	}
	
	public double getSuper() {
		return super.x;
	}
	
	public double getSub() {
		return this.x;
	}
}