package sec1;
//��� : ���α׷��ֿ��� ���α׷��� �帧�� �����ϴ°�
//���� �б⹮ : ���ǿ� ���� ���೻���� �޶����� �ϴ� ��
//if : if, if/else, if/elseif/else
//switch : switch/case
//�ݺ��� : ���α׷��ֻ� ���� ���๮���� ������ �����ϰ� �ϴ� ��.
//for, while, do~while
//��Ÿ ���
//break, continue


public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "������";
		int kor = 80;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		
		String pass = "���հ�";
		//if(���ǽ�) {���๮}
		if (tot>=200) {						//�ܼ� if
			pass= "�հ�";
		}
		//if (tot>=200) pass= "�հ�"; ���ٷ� �� �� ����.
		//pass = (tot>=) ? "�հ�" : "���հ�"; 	//���� ������
		
		System.out.println("�հݿ��� : " +pass);
		
		if(kor>=90 || eng>=90 || mat>=90) {
			System.out.println("��������");	
		} else {
			System.out.println("�������� ��� �ƴ�");
		}

		if(kor>=90 && eng>=90 && mat>=90) {
			System.out.println("���л�");
		} else {
			System.out.println("�Ϲ��л�");
		}
		//pintln�� �ٹٲ�. pint���� �پ.
		
		//���� ���.
		System.out.print("���� : ");
		if (tot>=270) {
				System.out.print("A");
				if(tot>=290) {		//A
					System.out.println("+");
				} else if(tot>=280) {
					System.out.println("0");
				} else {
					System.out.println("-");
				}
		} else if (tot>=240) {		//B 269~240
			System.out.print("B");
			if(tot>=260) {
				System.out.println("+");
			} else if(tot>=250) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		} else if (tot>=210) {		//C 239~210
			System.out.print("C");
			if(tot>=230) {
				System.out.println("+");
			} else if(tot>=220) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		} else if (tot>=180) {		//D 209~180
			System.out.print("D");
			if(tot>=200) {
				System.out.println("+");
			} else if(tot>=190) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		} else {					//F
			System.out.println("get out");
		}
		
		System.out.print("\n");	//�ٹٲ�.
		//System.out.println();
		
		
		
	}

}