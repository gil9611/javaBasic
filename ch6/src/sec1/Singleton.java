package sec1;
//Ŭ������ �������� �ڷ��� Ÿ��
public class Singleton {
	
	
	int num;
	
	
	private static Singleton Singleton = new Singleton();
	private Singleton() {}		//������.
	//Singleton �������� ���� ��� private�̹Ƿ� ���� Ŭ���� ���ο����� ���� ����.
	
	
	
	static Singleton getInstance() {
		return Singleton;
	}
}
