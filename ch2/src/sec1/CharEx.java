package sec1;

public class CharEx {

	public static void main(String[] args) {
		// Char
		
		char c1 = 'K';
		char c2 = 'k';
		char c3 = 67;	//아스키코드 번호 문자가 입력됨.
		byte c4 = 97;
		char c5 = '김';
		char c6 = '\uac00'; // (백슬레시u) 유니코드로 사용가능한 문구
		
		int uni1 = c1;
		int uni2 = c5;
		
		System.out.println("c1 == c2 : " +(c1==c2));
		System.out.println("c3 = " +c3);
		System.out.println("c4 = " +c4);
		System.out.println("c5 = " +c5);
		System.out.println("c6 = " +c6);
		System.out.println("c1의 유니코드번호 : " +uni1);
		System.out.println("c5의 유니코드번호 : " +uni2);


	}

}
