package sec1;

public class Class3 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	static {				//���� �Ҵ�� �ڿ��� ��� ó���ϰų� Ȱ���� �� ����.
		//field1 = 100;		//(x)		
		//method1();		//(x) ���� �Ҵ�� �ڿ����� ���Ұ�
		field2 = 100;
		method2();
	}
}
