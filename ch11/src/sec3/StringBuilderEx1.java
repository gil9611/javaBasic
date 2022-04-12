package sec3;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		//문자열 더하기.
		
		String dog = "멍멍";
		String cat = "야옹";
		
		StringBuilder sb = new StringBuilder();
		sb.append("java ");
		sb.append("web ");
		sb.append(dog);
		sb.append(cat);
		System.out.println(sb);
		
		sb.insert(4, "8");			//특정위치 중간 삽입
		System.out.println(sb);
		
		sb.setCharAt(4, '6');		//특정위치 변경
		System.out.println(sb);
		
		sb.replace(10, 21, "Programmer");	//특정번째 문자열 바꾸기.
		System.out.println(sb);
		
		sb.delete(4, 5);		//특정위치 삭제
		System.out.println(sb);
		
		//StringBuilder를 String으로 반환
		String res = sb.toString();
		System.out.println(res);
		
		//반대
		StringBuilder sb2 = new StringBuilder(res); 

	}

}
