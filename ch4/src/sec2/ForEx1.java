package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		//for(�ʱⰪ;���ǽ�;������) {�ݺ������� ����;}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+"��°---------");
		}
		//�ʱⰪ ����.
		//���ǽ� ����
		//�ݺ����� ���� ����
		//������ ����.
		//���ǽ� ����
		//�ݺ�...~~~
		
		for(int i=0; i<=10; i++) {
//			if(i % 2 == 1) System.out.println("i=" +i);
			//Ȧ���� ���� ���.
			
			if(i % 2 == 0) continue; //¦���϶� �ǳʶٱ�
			System.out.println("i=" +i);
		}
		
		for(int i=1; i<=10; i+=2) {
			//i�� 2�� ����.
			System.out.println("i2=" +i);
		}
		
		//1~100�հ�
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100 �հ� " +sum);
		// 1~100������ 3�� ��� �հ踦 ���Ͽ� ���
		
		sum = 0;
		int mul = 4;	//��� ��.
		for(int i=1; i<=100; i++) {
			if(i % mul == 0) {
				sum += i;
			}
		}
		System.out.println("1���� 100������ " +mul +"�� ����� �հ� : "+sum);
		
		sum = 0;
		for(int i=0; i<=100; i+=mul) {
			sum+=i;
		}
		System.out.println("1���� 100������ " +mul +"�� ����� �հ� : "+sum);
		
		sum = 0;
		for(int i=0; i<=100; i++) {
			if(i % mul != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1���� 100������ " +mul +"�� ����� �հ� : "+sum);
	
	}

}