package sec2;

public class ForceCasting1 {

	public static void main(String[] args) {
		//강제캐스팅 : 더 큰 데이터를 작은 타입의 변수에 데이터를 저장
		
		int a = 100;
		short b = (short) a;	//강제캐스팅
		byte c = (byte) a;
		
		int i1 = 65000;
		short s1 = (short) i1;	//되기는 하다. short 범위 -32768~32767
		System.out.println("s1 = " +s1);	//만약 담지 못하는 데이터를 강제캐스팅할 경우 데이터는 왜곡된다.
		
	}

}
