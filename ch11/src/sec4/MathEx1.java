package sec4;

import java.util.Scanner;

public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//절대값을 대입.
		int v1 = Math.abs(-6);
		double v2 = Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);
		
		
		System.out.println("올림---------");
		System.out.println(Math.ceil(6.3));				//올림.
		System.out.println(Math.ceil(-6.3));
		System.out.println("내림---------");
		System.out.println(Math.floor(6.3));			//내림
		System.out.println(Math.floor(-6.3));
		System.out.println("반올림--------");
		System.out.println(Math.rint(6.3));				//반올림. 실수
		System.out.println(Math.rint(-6.3));
		System.out.println(Math.rint(6.8));				
		System.out.println(Math.rint(-6.8));
		System.out.println("반올림 정수--------");
		System.out.println(Math.round(6.3));			//반올림. 정수
		System.out.println(Math.round(-6.3));
		System.out.println(Math.round(6.8));				
		System.out.println(Math.round(-6.8));
		
		System.out.println("도수분포에서 큰수. 두개만 비교함. " +Math.max(8, 9));
		System.out.println("도수분포에서 작은 수. 두개만 비교함. " +Math.min(8, 9));
		
		System.out.println("랜덤." +Math.random()); 		//0~1 사이 아무수나 무작위로 나옴.
		for(int i=0;i<100;i++) {
			System.out.println("랜덤수"+i+" : "+((int) (Math.random()*6)+1));
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<6; i++) {
			System.out.print(((int) (Math.random()*45)+1) +"\t");
		}
		System.out.println("");

	}

}
