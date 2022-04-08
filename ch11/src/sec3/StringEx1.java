package sec3;

public class StringEx1 {

	public static void main(String[] args) {
		byte[] bytes = {74, 101, 107, 111, 34, 66};
		char[] chars = {'a','b','c'};
		
		//string 생성자는 문자배열이나 바이트배열을 문자열ㄹ로 변환
		String str1 = new String(bytes);
		System.out.println("str1= " +str1);
		String str2 = new String(chars);
		System.out.println(chars);
		String str3 = new String(bytes, 2, 3); //string 문자배열,시작인덱스,갯수
		System.out.println("str3= " +str3);
		
		
		String data = "바보멍청이";
		System.out.println(data.charAt(2)); //특정 인덱스 위치의 문자를 추출
		System.out.println("문자배열의 주소 : " +data.getBytes());
		System.out.println("멍의 위치 : " +data.indexOf("멍"));	//특정 문자의 위치를 반환
		System.out.println("data의 글자수 : " +data.length());		//글자수
		String a = data.replace("보멍", "야옹");
		System.out.println(a);
		
		
		String jumin = "123456-2900009";
		System.out.println("출생년도 : " +jumin.substring(0, 2));		//begin이상 ~ end미만
		System.out.print("성별 : ");
		int s = Integer.parseInt(jumin.substring(7,8));
		switch (s){
		case 1:
		case 3:
			System.out.println("남");
			break;
		case 2:
		case 4:
			System.out.println("여");
			break;
		default:
				System.out.println("몰루");
		}
		System.out.println("주민번호 뒷자리 : " +jumin.substring(7));	//7번째부터 끝까지. end가 생략되면 끝까지/
		
		String learn = "   Java Web Programming   ";
		System.out.println("소문자로 : " +learn.toLowerCase());
		System.out.println("대문자로 : " +learn.toUpperCase());
		System.out.println("글자수 " +learn.length());
		System.out.println("공백제거 글자수 : " +(learn.trim().length()));
		String no1 = learn.trim(); 
		System.out.println("공백제거 텍스트 : " +no1);
		
		int numA = 90;
		float numB = 3.14f;
		
		String d = String.valueOf(numA);		//숫자 90을 문자열 "90"으로
		int e = Integer.parseInt(d);			//문자열 "90"을 숫자 90으로
		
		String f = String.valueOf(numB);		//실수 3.14을 문자열 "3.14"로
		float g = Float.parseFloat(f);			//문자열 "3.14"를 실수 3.14로
		
		String name1 = "바보";
		String name2 = "멍청이";
		if(name1.equals(name2)) {		//문자열 비교.
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
