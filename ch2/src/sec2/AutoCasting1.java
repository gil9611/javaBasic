package sec2;

public class AutoCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 40;		//1byte
		short b = 40;		//2byte
		int c= 40;			//4byte
		long d = 40;		//8byte
		//long k = 12345678907890;				//long�� ���� ũ������ ��������. �⺻ �����ڴ� int�̹Ƿ� int �������� ũ��, ����.
		long k = 12345678907890L;				//L�� ���� ���̸� �ȴ�.
		
		short s1 = a;		//�ڵ����� byte -> shot ����ȯ. �ڵ�����ȯ(auto casting)
		int i1 = a;			//�ڵ����� byte -> int �ڵ�����ȯ.
		long l1 = a;		//�ڵ����� byte -> long �ڵ�����ȯ
		
		//byte b2 = b;		//byte/shortū ũ�⸦ ���� ���� ���� �� ����. �����÷ο�
		int i2 = b;			//�ڵ����� short -> int
		long l2 = b;		//short -> long
		
		//byte b3 = c;		//int/byte �����÷ο�
		//short s3 = c;		//int/short �����÷ο�
		long l3 = c;		//int -> long
		
		//�� ū Ÿ���� �����ҿ� ���� ũ���� �����͸� ������ �� ������
		//���� ũ���� �����ʹ� ū ũ�� Ÿ������ �ڵ����� Ÿ���� ������ �ȴ�.
		
		float e = 256.278f;		//4byte
		double f = 256.278;		//8byte
		double g = 23456789.2435486546321321535321D;		//long�� ���������� ������ �� �� �����Ƿ� float ������ ��� �� ������  D�� �ٿ��ָ� �ȴ�.
		
		//float e1 = f;
		double d1 = e;		//�ڵ�����ȯ
		
		char c1 = 'G';		//2byte
		byte k1 = 120;		//1byte
		
		System.out.println("c1 = " +c1);
		System.out.println("k1 = " +k1);
		
		//byte k2 = c1;		//ũ�Ⱑ �޶� ĳ������ �ȵ�.
		//chart c2 = k1;	//���� ������ �޶� ĳ������ �ȵ�
		
		int j1 = c1;		//���� ������ �ٸ����� ĳ������ �Ǵ� ����.
		System.out.println("j1 = " +j1);
		System.out.println("G�� �ƽ�Ű�ڵ��ȣ : " +j1);
		
		double d2 = l1;		//����long -> �Ǽ�
		//long l4 = f;		//�Ǽ�double -> ���� �� �ȵ�.
		
		float avg = (100+70+80) / 3;			//�Ҽ����� ���� ���;�������, ���������� ��꿡�� �Ǽ��� ������ ����.
		System.out.println("��� : " +avg);
		float avg2 = (100+70+80) / 3f;			//f�� �ٿ��� �Ǽ��� �������ָ�
		System.out.println("��� : " +avg2);		//�Ҽ� ���ϰ� ����
		float avg3 = (float) (100+70+80) / 3f;	//���� ĳ����
		System.out.println("��� : " +avg3);
	}

}
