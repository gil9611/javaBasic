package sec1;

public class Operator1 {

	public static void main(String[] args) {
		//연산자.
		//산술연산자 : +, -, *, /, %
		//논리연산자 : &&(and), ||(or), !(not). 2진수 &, |, ^
		//비교연산자 : >, >=, <, <=, ==. !=
		//대입연산자 : =, +=
		//증감연산자 : ++, --
		//비트연산자 : &, |, ^, >>, <<, >>> 2진수..?
		
		//입력 및 비교하는 개수(항)에 따라, 단항 이항 삼항

		
		//a = true;
		//b = !a; 단항
		//c = 20;
		//d = 30;
		//e = a + b; 이항
		//변수 = 비교식 ? 참 : 거짓 - 삼항
		int a = 20;
		int b = 30;
		String pass = a>b ? "a가 더 크다" : "b가 더 크다";
		System.out.println("비교 결과 : " +pass);
		
		boolean c = true;
		System.out.println("c의 반대 : " +(!c));
		int res = a + b;
		System.out.println("a+b = " +(a+b));
		System.out.println("a+b = "+a+b);
		//연산자의 우선순위 : 증감 > 산술 > 비교 > 논리 > 대입
		// a>b && b>c   //a가 b보다 크고 b가 c보다 클 때.
		//증감 연산자와 산술 연산자는 숫자, 문자로 결과가 나온다.
		//비교 연산자와 논리 연산자는 결과가 true 아니면 false로 나온다.
	}

}
