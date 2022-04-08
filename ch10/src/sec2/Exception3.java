package sec2;

public class Exception3 {
	
	//예외 떠넘기기.
	//만약 처리내용이 문제가 발생하면, throws 구절을 이용하여 해당 예외를 자바에서 처리하게 한다.
	//throws 구절이 제일 중요.
	public void method1() throws ClassNotFoundException {
		method2(); //실행내용
	}
	
	public void method2() {
		try {
			Class cla = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스 없음");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("몰루");
			e.printStackTrace();
		} finally {
			System.out.println("exit");
		}
	}

}
