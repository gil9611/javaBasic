package sec1;

public class FloatEx {

	public static void main(String[] args) {
		// �Ǽ� : �ε��Ҽ����� -> float. 4byte	double. 8byte 
		
		int kor = 100;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		//int avg = tot / 3;			//����� �Ҽ��� ���ϰ� ���� �� �����Ƿ� int�� �ƴ϶� float�� �ϴ°��� �ٶ����ϴ�.
		float avg = tot / 3.0f;			// ���� / ���� = ����. �Ǽ��� �������� �Ǽ����� ���´�.
		
		double pi1 = 3.1415;			//f���� ����
		float pi2 = 3.1415f;
		
		int radius = 20;
		float area = radius * radius * pi2;		//double�� pi1�� ����ϸ� double�� ������ �� ũ�Ƿ� ����.
		//ǥ�� ������ �ʹ� ���� Ÿ���� ���� �Ը� ū �����͸� �����ϰų� ó������ ���ϹǷ�,, ������ ū Ÿ���� ���
		//�ݴ�� ǥ�� ������ �ʹ� ũ�� �޸� �뷮�� ���� �����ϰ� �ǹǷ� ū �޸𸮰� �ʿ��ϸ� ����ӵ��� ������.
		//������ �����ϰ��� �ϴ� ������Ʈ�� ���� ������ �Ը� ���ϰ�, Ÿ���� �����ؾ� �Ѵ�.
		
		System.out.println("���� : " +tot);
		System.out.println("��� : " +avg);

	}

}
