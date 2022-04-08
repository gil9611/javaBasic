package sec1;

public class NullPointer {

	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("null이 있음");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("이유불명");
			e.printStackTrace();
		} finally {		//끝에 반드시 실행되는 부분.
			System.out.println("프로그램 종료");
		}

	}

}
