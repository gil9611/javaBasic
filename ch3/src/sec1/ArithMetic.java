package sec1;

public class ArithMetic {

	public static void main(String[] args) {
		// 산술연산 : +, -, *, /, %
		// 우선순위 산수 우선순위에 따라.
		
		int a = 20;
		int b = 7;
		System.out.println("a+b = " +(a+b));
		System.out.println("a-b = " +(a-b));
		System.out.println("a*b = " +(a*b));
		System.out.println("a/b = " +(a/b));	//몫. 소수점 이하는 버림
		System.out.println("a%b = " +(a%b));	//나머지
		System.out.println("아무개는 " +"일을 잘하는" +1004 +"입니다.");
		//정수 +정수 = 정수
		//정수 +실수 = 실수
		//실수 +실수 = 실수
		//문자열 +숫자 = 문자열
		//숫자 +숫자 +문자열 = 문자열
		//7 +8 +길정훈 = 17길정훈
	}

}
