//본인이 태어난 달을 숫자 정수로 입력하면 해당하는 달의 탄생석을 출력
/*
 * 1월	석류석	가넷
 * 2월	자수정	아메시스트
 * 3월	남옥		아쿠아마린
 * 4월	금강석	다이아몬드
 * 5월	비취		에메랄드
 * 6월	진주		펄
 * 7월	홍옥		루비
 * 8월	감람석	페리도트
 * 9월	청옥		사파이어
 * 10월	단백석	오팔
 * 11월	황옥		토파즈
 * 12월	녹송석	터키
 */

package sec1;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("태어날 달을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		int mode = sc.nextInt();
		
		switch(mode) {
			case 1:
				System.out.println("1월의 탄생석은 석류석, 가넷입니다.");
				break;
			case 2:
				System.out.println("2월의 탄생석은 자수정, 아메시스트입니다.");
				break;
			case 3:
				System.out.println("3월의 탄생석은 남옥, 아쿠아마린입니다.");
				break;
			case 4:
				System.out.println("4월의 탄생석은 금강석, 다이아몬드입니다.");
				break;
			case 5:
				System.out.println("5월의 탄생석은 비취, 에메랄드입니다.");
				break;
			case 6:
				System.out.println("6월의 탄생석은 진주, 펄입니다.");
				break;
			case 7:
				System.out.println("7월의 탄생석은 홍옥, 루비입니다.");
				break;
			case 8:
				System.out.println("8월의 탄생석은 감람석, 페리도트입니다.");
				break;
			case 9:
				System.out.println("9월의 탄생석은 청옥, 사파이어입니다.");
				break;
			case 10:
				System.out.println("10월의 탄생석은 단백석, 오팔입니다.");
				break;
			case 11:
				System.out.println("11월의 탄생석은 황옥, 토파즈입니다.");
				break;
			case 12:
				System.out.println("12월의 탄생석은 녹송석, 터키입니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}

	}

}
