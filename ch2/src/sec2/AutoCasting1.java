package sec2;

public class AutoCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 40;		//1byte
		short b = 40;		//2byte
		int c= 40;			//4byte
		long d = 40;		//8byte
		//long k = 12345678907890;				//long에 담기는 크기지만 오류가남. 기본 제공자는 int이므로 int 단위보다 크면, 오류.
		long k = 12345678907890L;				//L을 끝에 붙이면 된다.
		
		short s1 = a;		//자동으로 byte -> shot 형변환. 자동형변환(auto casting)
		int i1 = a;			//자동으로 byte -> int 자동형변환.
		long l1 = a;		//자동으로 byte -> long 자동형변환
		
		//byte b2 = b;		//byte/short큰 크기를 작은 곳에 담을 수 없음. 오버플로우
		int i2 = b;			//자동으로 short -> int
		long l2 = b;		//short -> long
		
		//byte b3 = c;		//int/byte 오버플로우
		//short s3 = c;		//int/short 오버플로우
		long l3 = c;		//int -> long
		
		//더 큰 타입의 기억장소에 작은 크기의 데이터를 저장할 수 없으며
		//작은 크기의 데이터는 큰 크기 타입으로 자동으로 타입이 변경이 된다.
		
		float e = 256.278f;		//4byte
		double f = 256.278;		//8byte
		double g = 23456789.2435486546321321535321D;		//long과 마찬가지로 오류가 날 수 있으므로 float 범위를 벗어날 것 같으면  D를 붙여주면 된다.
		
		//float e1 = f;
		double d1 = e;		//자동형변환
		
		char c1 = 'G';		//2byte
		byte k1 = 120;		//1byte
		
		System.out.println("c1 = " +c1);
		System.out.println("k1 = " +k1);
		
		//byte k2 = c1;		//크기가 달라 캐스팅이 안됨.
		//chart c2 = k1;	//서로 성격이 달라 캐스팅이 안됨
		
		int j1 = c1;		//서로 성격이 다르지만 캐스팅이 되는 예외.
		System.out.println("j1 = " +j1);
		System.out.println("G의 아스키코드번호 : " +j1);
		
		double d2 = l1;		//정수long -> 실수
		//long l4 = f;		//실수double -> 정수 는 안됨.
		
		float avg = (100+70+80) / 3;			//소수이하 수가 나와야하지만, 정수끼리의 계산에선 실수가 나오지 않음.
		System.out.println("평균 : " +avg);
		float avg2 = (100+70+80) / 3f;			//f를 붙여서 실수로 변경해주면
		System.out.println("평균 : " +avg2);		//소수 이하가 나옴
		float avg3 = (float) (100+70+80) / 3f;	//강제 캐스팅
		System.out.println("평균 : " +avg3);
	}

}
