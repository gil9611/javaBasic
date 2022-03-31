package sec2;

public class ArithMetic2 {

	public static void main(String[] args) {
		// 연산 오류에 대한 예외
		//문법적 오류, 연산오류, 논리 오류
		int a = 20, b = 0, c;
		//String = "정훈";
		System.out.println("a/b = " +(a/b));	//연산오류. 불능.0으로 나눌 수 없음.->무한대 Infinity
		//System.out.println("a/c = " +(a/c));	//nell값. 문법오류
		System.out.println("a%b = " +(a%b));	//연산오류. 부정. 값 자체가 없다..? ->(Not a Number) NaN
		//System.out.println("a/name = " +(a/name));	//문자로 나누기 안됨.
	}

}
