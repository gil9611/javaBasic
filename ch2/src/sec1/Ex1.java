package sec1;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 :  주기억장치 안에 데이터를 넣는 공간 하나
		String name;	//여러글자
		//기본 자료형(primitive)
		name = "길정훈";
		
		char pass = 'y';		//한글자 변수의 선언과 초기화
		
		byte data1;		//1바이트
		boolean data2;	// 참or거짓
		int su1;		//정수
		long su2;
		float su3;		//소수점 2재짜리
		double su4;		//소수점 4째?
		
		//변수는 소문자 클래스이름은 첫글자 대문자 _관례
		/*변수는 하나의 값을 저장할 수 있는 메모리공간
		 *변수명의 명명 규칙
		 * 첫 글자는 영문으로 시작하는 것이 원칙이나, 특수문자 중에서 $또는 _로 시작할 수는 있다.
		 * 영문 대소문자는 엄격히 구분된다.
		 * 자바의 예약어는 사용할 수 없으나, 다른 문자나 숫자를 혼용하여 사용하기도 한다.
		 * 변수명이나 클래스명은 관례상 그 용도를 쉽게 알 수 있게 사용을 해야한다.
		 * 변수명이나 클래스명 메서드명 등은 여러 단어를 연결하여 선언할 경우는 언더스코어방식(_)
		 * 또는 카멜방식을 활용한다.
		 * jeonghungohome (x)
		 * jeonghunGoHome (o) 카멜방식. 중간에 대문자를 넣는 것
		 * jeonghun_go_home (o) 언더스코어방식 띄어쓰기.
		 * 
		 * 예약어
		 * 
		 * 선언자 (private, public, protected, static, final)
		 * 기본자료형 선언 키워드(char, byte, boolean, int, long, float, double)
		 * 참조형 선언 키워드(Char, Byte, Bloolean, Integer, Long, Float, Double)
		 * 클래스 관련 선언 키워드(class, 등등)
		 * 객체 관련 키워드(new, this, super, null)
		 * 명령문 키워드(if, else, switch, case, 등등
		 * 기타 키워드 true, false, void, return 등등
		 */
		 //리터럴 : 변수에 저장되는 값, 문자, 문자열, 정수(단,일,배) 실수(단,배) 2진수 8진수 16진수
		  String nickname = "호랑이";
		  //string nick1 = 't'; 오류남. 작은 따옴표 
		  char nick2= 't'; 
		  
		  byte a= 19; //오류. 1byte=8bit => -128 ~ 127 언더플로우
		  short c= 32767; //2byte=16bit => -32768~32767
		  int b= 250; //4byte=32bit => 괭장해 엄청나 21억/
		  long d = 450; //8byte=64bit => 으악
		  
		 /* 부동소수점수= 실수
		 * 365.325=0.365325 * 10의3승
		 * 부호 지수 가수
		 * +   3승  365325
		 */
		  float e = 364.325f; //4byte=32bit f를 써야함
		  double f = 36.245d; //8byte=>64bit 얘는 d를 생략가능
		  boolean g = true; //1bit => ibyte 1비트라도 1바이트로 저장.  true or
		  char h = 'k'; 		//2bytㄷ
		  //String i = 256;  타입에러
		  //int j= "길정훈";
		 /*
		  * 저장크기 단위
		  * 1024byte(2의 10승) = 1KB
		  * 1024KB = 1MB
		  * 1024MB = 1GB
		  * 1024GB = 1TB
		  * 1024TB = 1PB
		  * 1024PB = 1EB
		  * KMGTPE 김기태페
		  */
		  
		  int k1 = 0b1101;	//2진수 리터럴
		  int k2 = 0123;	//8진수 리터럴
		  int k3 = 0x123;	//16진수 리터럴
		  System.out.println("k1="+k1+ ", k2="+k2+ ", k3="+k3);
		
	}

}
