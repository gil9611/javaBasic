package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		//for(초기값;조건식;증감식) {반복실행할 문장;}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+"번째---------");
		}
		//초기값 실행.
		//조건식 실행
		//반복실행 문장 실행
		//증감식 실행.
		//조건식 실행
		//반복...~~~
		
		for(int i=0; i<=10; i++) {
//			if(i % 2 == 1) System.out.println("i=" +i);
			//홀수일 때만 출력.
			
			if(i % 2 == 0) continue; //짝수일때 건너뛰기
			System.out.println("i=" +i);
		}
		
		for(int i=1; i<=10; i+=2) {
			//i가 2씩 증가.
			System.out.println("i2=" +i);
		}
		
		//1~100합계
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100 합계 " +sum);
		// 1~100까지의 3의 배수 합계를 구하여 출력
		
		sum = 0;
		int mul = 4;	//배수 값.
		for(int i=1; i<=100; i++) {
			if(i % mul == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지의 " +mul +"의 배수의 합계 : "+sum);
		
		sum = 0;
		for(int i=0; i<=100; i+=mul) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 " +mul +"의 배수의 합계 : "+sum);
		
		sum = 0;
		for(int i=0; i<=100; i++) {
			if(i % mul != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 " +mul +"의 배수의 합계 : "+sum);
	
	}

}
