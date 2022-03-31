package sec2;

public class ExpresionArea1 {

	public static void main(String[] args) {
		//표현범위
		
		//상수는 대문자. 값이 정해져있는 수.
		System.out.println("byte의 표현범위 : " +Byte.MIN_VALUE+ " ~ " +Byte.MAX_VALUE);
		System.out.println("short의 표현범위 : " +Short.MIN_VALUE+ " ~ " +Short.MAX_VALUE);
		System.out.println("int의 표현범위 : " +Integer.MIN_VALUE+ " ~ " +Integer.MAX_VALUE);
		System.out.println("long의 표현범위 : " +Long.MIN_VALUE+ " ~ " +Long.MAX_VALUE);
		System.out.println("float의 표현범위 : " +Float.MIN_VALUE+ " ~ " +Float.MAX_VALUE);
		System.out.println("double의 표현범위 : " +Double.MIN_VALUE+ " ~ " +Double.MAX_VALUE);
		
		float b = 2.5f;
		float a = 5 + b;
		System.out.println(a);
		
		

	}

}
