package sec1;

public class IntEx {

	public static void main(String[] args) {
		//int Ÿ���� ���� Ȱ��
		//integer ����. �Ҽ��� ���ϰ� ���� ��.
		//������(short. 2byte) �Ϲ�(int. 4byte) ������(long. 8byte)
		
		int i1 = 102400;
		//short i2 = 102400;	//�����÷ο�. 2byte=16bit => -32768~32767
		short a1 = 5120;
		//short a2 = a1 * 2;	//�����÷ο�.
		int a2 = a1 * 2;		//int�� ����� �����÷ο찡 ���� �ʴ´�.
		
		System.out.println("i1= " +i1);
		System.out.println("a1= " +a1);
		System.out.println("a2= " +a2);
		
		long b1 = 655360789;
		//int b2 = b1 * 10;		//long Ÿ���� �ξ� ǥ�������� ũ�Ƿ� �� ���� int Ÿ���� ������ ���� ������ �� ����.

	}

}
