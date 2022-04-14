package sec3;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		//StringTokenizer
		//스트링객체.split("구분기호");
		
		 String str = "김아무개&김머시기,김승려-김승자%김민&김김";
		 String[] arr = str.split("&|,|-|%");		//분리할 기호 나열
		 
		 /*
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 */
		 
		 for(String n : arr) {		//자바에서 제공되는 기능. n에 arr을 대입하고, 그 배열을 반복.
			 System.out.println(n);
		 }
		 
		 System.out.println("----------token----------");
		 
		 str = "이머시기/이아무개/이무기/이모기/이다랑이";
		 StringTokenizer s = new StringTokenizer(str, "/");
		 
		 int l = s.countTokens();
		 for(int i = 0; i<l; i++) {
			 String t = s.nextToken();			//토큰이라는 형태로 저장함.
			 System.out.println(t);
		 }
		 
		 System.out.println("----------while----------");
		 
		 StringTokenizer s2 = new StringTokenizer(str, "/");
		 while(s2.hasMoreTokens()) {
			 String t2 = s2.nextToken();
			 System.out.println(t2);
		 }

	}

}
