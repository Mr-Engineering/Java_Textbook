package knou;

class IniTest {
	int nValue = 1;
	{
		nValue = 2;      // 초기화 블록
	}
	public IniTest() {    
		nValue = 3;
	}

}
