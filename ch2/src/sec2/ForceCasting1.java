package sec2;

public class ForceCasting1 {

	public static void main(String[] args) {
		//����ĳ���� : �� ū �����͸� ���� Ÿ���� ������ �����͸� ����
		
		int a = 100;
		short b = (short) a;	//����ĳ����
		byte c = (byte) a;
		
		int i1 = 65000;
		short s1 = (short) i1;	//�Ǳ�� �ϴ�. short ���� -32768~32767
		System.out.println("s1 = " +s1);	//���� ���� ���ϴ� �����͸� ����ĳ������ ��� �����ʹ� �ְ�ȴ�.
		
	}

}
