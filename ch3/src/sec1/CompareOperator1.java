package sec1;

public class CompareOperator1 {

	public static void main(String[] args) {
		// 비교연산자 활용
		
		int a= 30;
		int b= 20;
		String name = "길정훈";
		
		System.out.println("a>b : " +(a>b));
		System.out.println("a>=40 : " +(a>=40));
		System.out.println("a<b : " +(a<b));
		System.out.println("a<=40 : " +(a<=40));
		System.out.println("a==b : " +(a==b));
		System.out.println("b!=30 : " +(b!=30));
		System.out.println("name=\"김아무\" : " +(name=="김아무"));		// \' \"는 출력하는 따옴표가 아님. 출력따옴표 안에 따옴표가 필요하면 사용.
		
	}

}
