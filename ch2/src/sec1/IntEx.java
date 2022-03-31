package sec1;

public class IntEx {

	public static void main(String[] args) {
		//int 타입의 변수 활용
		//integer 정수. 소숫점 이하가 없는 수.
		//단정도(short. 2byte) 일반(int. 4byte) 배정도(long. 8byte)
		
		int i1 = 102400;
		//short i2 = 102400;	//오버플로우. 2byte=16bit => -32768~32767
		short a1 = 5120;
		//short a2 = a1 * 2;	//오버플로우.
		int a2 = a1 * 2;		//int로 선언시 오버플로우가 되지 않는다.
		
		System.out.println("i1= " +i1);
		System.out.println("a1= " +a1);
		System.out.println("a2= " +a2);
		
		long b1 = 655360789;
		//int b2 = b1 * 10;		//long 타입이 훨씬 표현범위가 크므로 더 작은 int 타입의 변수에 값을 저장할 수 없다.

	}

}
