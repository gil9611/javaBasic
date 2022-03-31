package sec1;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		int edps, pl, db;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전산의 점수를 입력해주세요.");
		edps = sc.nextInt();
		System.out.println("프로그래밍의 점수를 입력해주세요.");
		pl = sc.nextInt();
		System.out.println("데이터베이스의 점수를 입력해주세요.");
		db = sc.nextInt();
		
		int tot = edps + pl + db;
		

	}

}
