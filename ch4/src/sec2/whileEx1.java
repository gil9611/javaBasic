package sec2;

public class whileEx1 {

	public static void main(String[] args) {
		//ī��Ʈ���� �ʱ�ȭ; while(���ǽ�) {�ݺ����๮; ������;}
		//���ǰ� �������, ī��Ʈ������ ������ ��ġ�� ���� �� ����� ���� �޶���.
		
		int i = 0, sum = 0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		
		System.out.println("sum= " +sum);
		
		
		
		//1���� 100���� 4�� ����� �ջ����� ���.
		i = 0;
		sum = 0;
		int mul = 4;
		while(i<=100) {
			if(i % mul == 0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("1���� 100������ " +mul +"�� ����� �հ� : "+sum);

	}

}
