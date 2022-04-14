package sec4;

import java.util.regex.Pattern;

public class p {

	public static void main(String[] args) {
		//정규표현식.
		//입력된 데이터가 원하는 형식이 맞는지 검증하는 식.
		
		/*
		한개의 문자 [] -> 	[abc] abc중 하나의 문자를 포함해야한다
						[^abc] 문자열중 한단어라도 abc를 포함하면 안됨.
						[a-z] a~z 영문 소문자가 포함되는지
						[a-zA-Z] 영문 대문자나 소문자가 포함되어 있는지
						[a-zA-Z0-9] 영문 숫자가 포함되는지
		\d		-> 십진수 [0-9]
		\s		-> 공백이 포함되어 있는지
		\w		-> [a-zA-Z0-9]와 동일
		?		->한개 글자.  ex) kbs? -> kbs, kbs1, kbsa, kbsf ..... ?자리에 한글자.
		*		->여러 글자. ?와는 다르게 여러 글자가 들어갈 수 있음.
		+		->1개 이상. 위와는 다르게 kbs는 포함 불가. 한글자라도 붙어야함.z
		{n}		->n글자. 		ex) \d{3} 숫자 3글자.
		{n,m}	->n글자 또는 m글자.
		()		->그룹.	(02|031)
		|		->또는.
		
		// 		ex)	전화번호 검증식 (02|031|010)-\d{3,4}-\d{4}
		 			이메일 검증식	\w+@\w+(\.\w+)?
		 			아이디 검증식	\w{8,12}		8글자 이상 12글자 이하. 12를 지우면 8글자 이상으로 됨.
		 			주민번호 검증식 \d{6}-\d{7}
		
		*/
		/*
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String data1 = "010-1248-1234";
		String data2 = "025-555-1234";
		String data3 = "031-5555-5555";
		
		boolean res = Pattern.matches(regExp, data1);
		*/
		
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String[] data = {"010-1248-1234", "025-555-1234", "031-5555-5555"};
		
		for(String iso : data) {
			boolean res = Pattern.matches(regExp, iso);
			if(res) {
				System.out.println("전화번호 형식 일치");
			} else {
				System.out.println("전화번호 형식 불일치");
			}
		}
		
		System.out.println("이메일 검증--------");
		
		String regEm = "\\w+@\\w+(\\.\\w+)?";
		String[] emails = {"em@gr.com","re@@dr.c","read.ddd"};
		
		for(String iso : emails) {
			boolean res = Pattern.matches(regEm, iso);
			if(res) {
				System.out.println(iso +"이메일 형식 일치");
			} else {
				System.out.println(iso +"이메일 형식 불일치");
			}
		}
	}

}
