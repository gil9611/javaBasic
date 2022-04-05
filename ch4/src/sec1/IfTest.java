package sec1;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edps, pl, db;		//Ű���� �Է��� ���� ����, ���α׷���, �����ͺ��̽�
		int tot;				//����
		float avg;			 	//���
		String hak, dv;			//����, ���л�����
		boolean pan;			//�հݿ���
		Scanner sc = new Scanner(System.in);	//Ű�����Է�
		
		System.out.println("������ ������ �Է����ּ���.");
		edps = sc.nextInt();
		System.out.println("���α׷����� ������ �Է����ּ���.");
		pl = sc.nextInt();
		System.out.println("�����ͺ��̽��� ������ �Է����ּ���.");
		db = sc.nextInt();
		String test1 = sc.next();
		
		tot = edps + pl + db;
		avg = tot/3.0f;		//�Ҽ��� ���� �� �ִ�. �Ǽ��Ѻκ�.
		
		//��������
		if (avg>=90) {
			//a
			if(avg>=98) {
				hak = "A+";
			} else if (avg>=94) {
				hak = "A0";
			} else {
				hak = "A-";
			}
			
		} else if (avg>=80) {
			//b
			if(avg>=88) {
				hak = "B+";
			} else if (avg>=84) {
				hak = "B0";
			} else {
				hak = "B-";
			}
		} else if (avg>=70) {
			//c
			if(avg>=78) {
				hak = "C+";
			} else if (avg>=74) {
				hak = "C0";
			} else {
				hak = "C-";
			}
		} else if (avg>=60) {
			//d
			if(avg>=88) {
				hak = "D+";
			} else if (avg>=84) {
				hak = "D0";
			} else {
				hak = "D-";
			}
		} else {
			//f
			hak= "F";
		}
		
		//�հݿ���
		if (edps>=70 && pl>=70 && db>=70) {
			pan = true;
		} else {
			pan = false;
		}
		
		//���л�����
		if (edps>=95 && pl>=95 && db>=95) {
			dv = "Ư���л�";
		} else if (edps>=95 || pl>=95 || db>=95) {
			dv = "�������л�";
		} else {
			dv = "�Ϲ��л�";
		}
		
		System.out.println("���� ���� : " +edps);
		System.out.println("���α׷��� ���� : " +pl);
		System.out.println("�����ͺ��̽� ���� : " +db);
		System.out.println("��� ���� : " +avg);
		System.out.println("����� ������ " +hak+ "�Դϴ�.");
		if (pan == true) {
			System.out.print("�����մϴ�. �հ��ϼ̽��ϴ�. ����� " +dv+ "�Դϴ�.");
		} else if (pan == false) {
			System.out.println("���հ��ϼ̽��ϴ�. ������ ���ư�����.");
		} else {
			System.out.println("������ �߻��߽��ϴ�. �ٽ� �Է����ּ���.");
		}
		// \t�� ���� ����� ��. ���ٰ� �Ʒ����� ��ġ��ų �� ���
		
	}

}
