package sec1;

public class CharEx {

	public static void main(String[] args) {
		// Char
		
		char c1 = 'K';
		char c2 = 'k';
		char c3 = 67;	//�ƽ�Ű�ڵ� ��ȣ ���ڰ� �Էµ�.
		byte c4 = 97;
		char c5 = 'h';
		char c6 = '\uac00'; // (�齽����u) �����ڵ�� ��밡���� ����
		
		int uni1 = c1;
		int uni2 = c5;
		
		System.out.println("c1 == c2 : " +(c1==c2));
		System.out.println("c3 = " +c3);
		System.out.println("c4 = " +c4);
		System.out.println("c5 = " +c5);
		System.out.println("c6 = " +c6);
		System.out.println("c1�� �����ڵ��ȣ : " +uni1);
		System.out.println("c5�� �����ڵ��ȣ : " +uni2);


	}

}
