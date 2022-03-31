package sec1;

public class Shift1 {

	public static void main(String[] args) {
		//시프트(자리이동) 연산 . 비트연산.
		
		int a= 20;	//10100
		
		System.out.println("a>>2 : " +(a>>2));
		//00101		5
		System.out.println("a<<2 : " +(a<<2));
		//1010000	80
		System.out.println("a>>>2 : " +(a>>>2));
		//System.out.println("a<<<2 : " +(a<<<2)); 안됨.
	}

}
