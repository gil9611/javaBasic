import java.util.Scanner;

public class test134 {

	public static void main(String[] args) {
		
		
		//3
		int sum=0;
		for(int i=0; i<=100; i+=3) {
			sum += i;
		}
		System.out.println(sum);
		
		
		//4
		int roll1 = 0, roll2 = 0;
		while(roll1+roll2 != 5) {
			roll1 = (int)(Math.random()*6) + 1;
			roll2 = (int)(Math.random()*6) + 1;
			System.out.println("두 주사위의 값은 " +roll1 +"과 " +roll2);
			System.out.println("합산은 " +(roll1+roll2) +"입니다.");
		}
		System.out.println("합산이 5이므로 종료.");
		
		//5
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((x*4)+(y*5) == 60) {
					System.out.println("(" +x +", " +y +")");
				}
			}
		}
		
		//6
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		//7
		
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			int in = sc.nextInt();
			
			switch(in) {
			case 1 : System.out.println("예금액> ");
			int in1 = sc.nextInt();
			balance += in1;
			break;
			case 2 : System.out.println("출금액> ");
			int in2 = sc.nextInt();
			balance = balance - in2;
			break;
			case 3 : System.out.println("잔고> " +balance);
			break;
			case 4 : System.out.println("");
			System.out.println("프로그램 종료");
			run = false;
			break;
			}
			
		}
		

	}

}
