package sec2;

public class NellEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a = null; �⺻���� null���� ���� �� ����.
		String b = null;
		int c = 20;					//�⺻���� ==�� != ���� �� ����.
		int d = 20;
		
		System.out.println("c == d : " +(c == d));
		System.out.println("c != d : " +(c != d));
		
		int[] e = {10,20,30}; 		//�������� �� �Ұ�. �ּҰ����� ���ϴ� ��.
		int[] f = {10,20,30};
		System.out.println("e == f : " +(e == f));
		System.out.println("e != f : " +(e != f));

		System.out.println("e == f : " +e.equals(f));	//�߿� �������� �񱳸� equals�� �ؾ��Ѵ�.
		
		String g = "������";
		String h = "������";
		System.out.println("g == h : " +(g==h));
		System.out.println("g != h : " +(g!=h));
		
		String i = new String("������");		//new Ű���带 Ȱ���� ��� �������� �ǹ���..
		String j = new String("������");		//�ּҷ� �񱳰� �ƴ�.
		System.out.println("i == j : " +(i==j));
		System.out.println("i != j : " +(i!=j));
		System.out.println("");
		System.out.println("i == j : " +i.equals(j));	//�������� �� ���Ϸ��� equals
	
	}

}