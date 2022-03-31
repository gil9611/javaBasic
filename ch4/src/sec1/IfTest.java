package sec1;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edps, pl, db;		//키보드 입력을 받을 전산, 프로그래밍, 데이터베이스
		int tot;				//총점
		float avg;			 	//평균
		String hak, dv;			//학점, 장학생종류
		boolean pan;			//합격여부
		Scanner sc = new Scanner(System.in);	//키보드입력
		
		System.out.println("전산의 점수를 입력해주세요.");
		edps = sc.nextInt();
		System.out.println("프로그래밍의 점수를 입력해주세요.");
		pl = sc.nextInt();
		System.out.println("데이터베이스의 점수를 입력해주세요.");
		db = sc.nextInt();
		
		tot = edps + pl + db;
		avg = tot/3.0f;		//소수가 나올 수 있다. 실수한부분.
		
		//학점계산기
		if (avg>=90) {
			//a
			if(avg>=98) {
				hak = "A+";
			} else if (avg>=94) {
				hak = "A0";
			} else {
				hak = "A-";
			}
			
		} else if (avg>=80) {
			//b
			if(avg>=88) {
				hak = "B+";
			} else if (avg>=84) {
				hak = "B0";
			} else {
				hak = "B-";
			}
		} else if (avg>=70) {
			//c
			if(avg>=78) {
				hak = "C+";
			} else if (avg>=74) {
				hak = "C0";
			} else {
				hak = "C-";
			}
		} else if (avg>=60) {
			//d
			if(avg>=88) {
				hak = "D+";
			} else if (avg>=84) {
				hak = "D0";
			} else {
				hak = "D-";
			}
		} else {
			//f
			hak= "F";
		}
		
		//합격여부
		if (edps>=70 && pl>=70 && db>=70) {
			pan = true;
		} else {
			pan = false;
		}
		
		//장학생여부
		if (edps>=95 && pl>=95 && db>=95) {
			dv = "특장학생";
		} else if (edps>=95 || pl>=95 || db>=95) {
			dv = "과목장학생";
		} else {
			dv = "일반학생";
		}
		
		System.out.println("전산 점수 : " +edps);
		System.out.println("프로그래밍 점수 : " +pl);
		System.out.println("데이터베이스 점수 : " +db);
		System.out.println("평균 점수 : " +avg);
		System.out.println("당신의 학점은 " +hak+ "입니다.");
		if (pan == true) {
			System.out.print("축하합니다. 합격하셨습니다. 당신은 " +dv+ "입니다.");
		} else if (pan == false) {
			System.out.println("불합격하셨습니다. 집으로 돌아가세요.");
		} else {
			System.out.println("오류가 발생했습니다. 다시 입력해주세요.");
		}
		// \t는 탭의 기능을 함. 윗줄과 아랫줄을 일치시킬 때 사용
		
	}

}
