package sec2;

public class Exception2 {

	//예외 떠넘기기.
	public static void method1() throws ClassNotFoundException{
		Class cla1 = Class.forName("java.lang.String2");
	}
	public static void method2() {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 없음");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("모름");
			e.printStackTrace();
		} finally {
			System.out.println("종료");
		}

	
	}

}
