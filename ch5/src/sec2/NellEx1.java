package sec2;

public class NellEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a = null; 기본형은 null값을 가질 수 없다.
		String b = null;
		int c = 20;					//기본형은 ==나 != 비교할 수 있음.
		int d = 20;
		
		System.out.println("c == d : " +(c == d));
		System.out.println("c != d : " +(c != d));
		
		int[] e = {10,20,30}; 		//참조형은 비교 불가. 주소값으로 비교하는 짓.
		int[] f = {10,20,30};
		System.out.println("e == f : " +(e == f));
		System.out.println("e != f : " +(e != f));

		System.out.println("e == f : " +e.equals(f));	//중요 참조형은 비교를 equals로 해야한다.
		
		String g = "길정훈";
		String h = "길정훈";
		System.out.println("g == h : " +(g==h));
		System.out.println("g != h : " +(g!=h));
		
		String i = new String("길정훈");		//new 키워드를 활용한 경우 참조형이 되버림..
		String j = new String("길정훈");		//주소로 비교가 됐다.
		System.out.println("i == j : " +(i==j));
		System.out.println("i != j : " +(i!=j));
		System.out.println("");
		System.out.println("i == j : " +i.equals(j));	//참조형을 값 비교하려면 equals
	
	}

}
