package knou_javatextbook;

abstract class AbShape {
	public double height, width;
	
	public AbShape(double h, double w) {height = h; width = w;}
	public void setHeight(double h) {height = h;}
	public void setWidth(double w) {width = w;}
	public double getHeight() {return height;}
	public double getWidth() {return width;}
	public abstract double getArea(); //�߻�Ŭ������ ��ӹ��� ������ �߻�޼ҵ带 �� ��� �޾ƾ� �Ѵ�.
}

class Triangle1 extends AbShape {
	public Triangle1(double h, double w) {super(h, w);}
	public double getArea() {return height * width * 0.5;}
}

class Box extends AbShape {
	public Box(double h, double w) {super(h,w);}
	public double getArea() {return height * width;}
}