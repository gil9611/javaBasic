package sec1;

public class NumberFormat {

	public static void main(String[] args) {
		String data1 = "90";
		String data2 = "3.14";
		String data3 = "아 몰랑";
		
		try {
			System.out.println(Integer.parseInt(data1));
			System.out.println(Double.parseDouble(data2));
			System.out.println(Integer.parseInt(data3));
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("상정외");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}

	}

}
