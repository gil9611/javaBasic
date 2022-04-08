package sec1;

//예외처리 : 혹시 정상적인 실행을 하지 못할경우, 그에 따른 대비책.
public class ExceptionEx1 {

	public static void main(String[] args) {
		int i;
		int a = 20;
		int[] arr = {10,20,30};
		String b = "김머시기";
		
		//예외상황.Exception
		
		//System.out.println("i="+i);
		//null값이 있어서 실행불가. NullPointerException
		
		//System.out.println("머? 0으로 나눈다고"+ (a/0));
		//특정 데이터를 0으로 나누려고 하여 실행불가. ZeroDivideException
		
		//System.out.println("arr[5] : " +(arr[5]));
		//배열요소의 정해진 범위를 벗어난 경우 실행불가. ArrayIndexOutofBoundsException
		
		//int c = (int)b;
		//문자열과 같이 숫자의형태로 가공할 수 없어 대입할 수 없는 경우. 실행불가. NumberFormatException
		
		
		//kumhoTire tire = new HankookTire();
		//HankookTire tire = tire;
		//참조형에서 형변환이 되지 않는 경우. 실행불가. ClassCastException
		
		//연결하거나 참조한 패키지에서 해당 클래스를 찾을 수 없을경우. 실행불가. ClassNotFoundException
		
		
		//try {실행문장;} catch{예외종류코드 e} {예외시 실행문장.}
		try {
			System.out.println(Integer.parseInt(b));
			System.out.println(a/0);
		} catch(NumberFormatException e) {
			System.out.println("정수로 못 바꿈.");
			System.out.println();
			e.printStackTrace();
		} catch (ArithmeticException e){
			System.out.println("0으로 나누려고 시도함");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
