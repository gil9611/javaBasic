package sec1;

public class BreadEx1 {

	public static void main(String[] args) {
		
		Bread cream1 = new Bread("ũ����","��ũ��",2000,100,5);
		Bread cream2 = new Bread("ũ����","��",1500,100);
		
		System.out.println(cream2.getName());
		
		Bread danpac1 = new Bread("���ϻ�", "����",1500,200);
		Bread danpac2 = new Bread("���ϻ�");
		Bread cream3 = new Bread("ũ����","��ũ��",2000,250);
		Bread cream4 = new Bread("ũ����","��ũ��",2500,250,100);
		Bread soboro1 = new Bread("�Һ���", "�Һ��ΰ���", 1200, 150, 50);
		Bread soboro2 = new Bread("�Һ���", "�а���", 1000);
		Bread crowasang1 = new Bread("ũ�οͻ�","�а���", 1500, 150, 50);
		Bread crowasang2 = new Bread("����ũ�οͻ�","����", 2000, 150, 50);
		
		System.out.println("�̸�: " +cream1.getName() +" ����: " +cream1.getPrice() +"�� �Ǹ� �հ�" +cream1.tot());
		System.out.println("�̸�: " +cream2.getName() +" ����: " +cream2.getPrice() +"�� �Ǹ� �հ�" +cream2.tot());
		System.out.println(cream2.getName());
		danpac1.tot();

	}

}
