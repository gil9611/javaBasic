package sec1;

public class Operator1 {

	public static void main(String[] args) {
		//������.
		//��������� : +, -, *, /, %
		//�������� : &&(and), ||(or), !(not). 2���� &, |, ^
		//�񱳿����� : >, >=, <, <=, ==. !=
		//���Կ����� : =, +=
		//���������� : ++, --
		//��Ʈ������ : &, |, ^, >>, <<, >>> 2����..?
		
		//�Է� �� ���ϴ� ����(��)�� ����, ���� ���� ����

		
		//a = true;
		//b = !a; ����
		//c = 20;
		//d = 30;
		//e = a + b; ����
		//���� = �񱳽� ? �� : ���� - ����
		int a = 20;
		int b = 30;
		String pass = a>b ? "a�� �� ũ��" : "b�� �� ũ��";
		System.out.println("�� ��� : " +pass);
		
		boolean c = true;
		System.out.println("c�� �ݴ� : " +(!c));
		int res = a + b;
		System.out.println("a+b = " +(a+b));
		System.out.println("a+b = "+a+b);
		//�������� �켱���� : ���� > ��� > �� > �� > ����
		// a>b && b>c   //a�� b���� ũ�� b�� c���� Ŭ ��.
		//���� �����ڿ� ��� �����ڴ� ����, ���ڷ� ����� ���´�.
		//�� �����ڿ� �� �����ڴ� ����� true �ƴϸ� false�� ���´�.
	}

}
