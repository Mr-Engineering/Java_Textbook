package knou_javatextbook;

public class GradeOutput2 {
	int e;
	int m;
	
	void input_grade(int a, int b) {
		e = a;
		m = b;
	}
	
	void output_grade() {
		System.out.println(e+m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeOutput2 g1, g2;
		g1 = new GradeOutput2();
		g2 = new GradeOutput2();
		g1.input_grade(90, 85);
		g2.input_grade(80, 70);
		
		g1.output_grade();
		g2.output_grade();
		
	}

}
