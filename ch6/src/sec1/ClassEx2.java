package sec1;

public class ClassEx2 {

	public static void main(String[] args) {
		Class2 obj1 = new Class2();		//��ü�� ���� �Ҵ�.
		obj1.method1();
		//obj1.method2();	//(x)		//������ ������ ������, ���� ǥ�ð� ���. �̷��� ������� �ʴ´�.
		Class2.method2();	//(o)		//static �ٷ� ���.
		//static ��ü�� �����Ͽ� Ȱ���ϴ� ���� �ƴϰ� ���� Ŭ���� �״�� Ȱ��
		
		//Class2.method1(); //(x)		//���� �Ҵ�Ǿ������Ƿ� ����Ȱ�� �Ұ�.

	}

}
