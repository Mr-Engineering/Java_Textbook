package knou;


class Grade {

	int e; //���� ������ ���� �ʵ�
	int m; //���� ������ ���� �ʵ�
	
	void input_grade(int a, int b)
	{
		e = a; // ���� ���� �Է�
		m = b; // ���� ���� �Է�
	}
	void output_grade() {
		//���� ���
		System.out.println(e+m);
	}
}
