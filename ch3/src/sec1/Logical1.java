package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//논리연산자 &&, ||, !, &, |, ^, ~
		int a = 30; 	// 11110
		int b = 20;		// 10100
		int c = 10;
		
		//a		11110
		//b		10100
		//~a				NOT(comlement)  보수.
		//^		01010 =>10  XOR
		//|		11110 =>30	OR
		//& 	10100 =>20	AND
		
		System.out.println("a와 b의 AND연산 : " +(a & b));
		System.out.println("a와 b의 OR연산 : " +(a | b));
		System.out.println("a와 b의 OR연산 : " +(a ^ b));
		System.out.println("~a -> 보수" +(~a));
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		
		//&&(AND)연산은 입력값이 모두 참일 때 참.
		System.out.println("&& => AND연산의 결과1 : " +(d && e));
		System.out.println("&& => AND연산의 결과2 : " +(d && f));
		System.out.println("&& => AND연산의 결과3 : " +(f && d));
		System.out.println("&& => AND연산의 결과4 : " +(f && f));
		
		//||(OR)연산은 입력값이 하나라도 참일 때 참. 
		System.out.println("|| => OR연산의 결과1 : " +(d || e));
		System.out.println("|| => OR연산의 결과2 : " +(d || f));
		System.out.println("|| => OR연산의 결과3 : " +(f || d));
		System.out.println("|| => OR연산의 결과4 : " +(f || f));
		
		//!(NOT) : 입력된 논리값을 반대로 반환. true는 false로 false는 true.
		System.out.println("! => NOT연산의 결과1 : " +(!d));
		System.out.println("! => NOT연산의 결과2 : " +(!f));
		
		
	}

}
