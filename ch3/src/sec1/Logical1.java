package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//�������� &&, ||, !, &, |, ^, ~
		int a = 30; 	// 11110
		int b = 20;		// 10100
		int c = 10;
		
		//a		11110
		//b		10100
		//~a				NOT(comlement)  ����.
		//^		01010 =>10  XOR
		//|		11110 =>30	OR
		//& 	10100 =>20	AND
		
		System.out.println("a�� b�� AND���� : " +(a & b));
		System.out.println("a�� b�� OR���� : " +(a | b));
		System.out.println("a�� b�� OR���� : " +(a ^ b));
		System.out.println("~a -> ����" +(~a));
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		
		//&&(AND)������ �Է°��� ��� ���� �� ��.
		System.out.println("&& => AND������ ���1 : " +(d && e));
		System.out.println("&& => AND������ ���2 : " +(d && f));
		System.out.println("&& => AND������ ���3 : " +(f && d));
		System.out.println("&& => AND������ ���4 : " +(f && f));
		
		//||(OR)������ �Է°��� �ϳ��� ���� �� ��. 
		System.out.println("|| => OR������ ���1 : " +(d || e));
		System.out.println("|| => OR������ ���2 : " +(d || f));
		System.out.println("|| => OR������ ���3 : " +(f || d));
		System.out.println("|| => OR������ ���4 : " +(f || f));
		
		//!(NOT) : �Էµ� ������ �ݴ�� ��ȯ. true�� false�� false�� true.
		System.out.println("! => NOT������ ���1 : " +(!d));
		System.out.println("! => NOT������ ���2 : " +(!f));
		
		
	}

}
