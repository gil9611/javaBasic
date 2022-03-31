package sec2;

public class whileEx1 {

	public static void main(String[] args) {
		//카운트변수 초기화; while(조건식) {반복수행문; 증감식;}
		//조건과 결과누적, 카운트변수의 증감식 위치에 따라 그 결과가 완전 달라짐.
		
		int i = 0, sum = 0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		
		System.out.println("sum= " +sum);
		
		
		
		//1부터 100까지 4의 배수의 합산결과를 출력.
		i = 0;
		sum = 0;
		int mul = 4;
		while(i<=100) {
			if(i % mul == 0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("1부터 100까지의 " +mul +"의 배수의 합계 : "+sum);

	}

}
