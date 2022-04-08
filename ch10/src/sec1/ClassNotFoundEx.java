package sec1;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		try {
			Class cl1 = Class.forName("java.lang.String");		//특정 클래스 부름.
			System.out.println("해당 클래스가 존재함.");
		} catch(ClassNotFoundException e) {
			System.out.println("classnot");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("i dont no");
			e.printStackTrace();
		} finally {
			System.out.println("exit");
		}

	}

}
