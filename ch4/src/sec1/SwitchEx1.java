package sec1;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		/*Switch(변수) {
		 *	case 1:
		 * 		실행문장;
		 * 		break;
		 * 	case ~:
		 * 		실행문장~;
		 * 		break;
		 * 	default:
		 * 		실행문장;
		 * 		break;
		 * }
		 */
		System.out.println("1입금 2출금 3조회 0종료");
		System.out.println("작업할 번호를 입력 0~3");
		Scanner sc = new Scanner(System.in);
		//ctrl shift o
		
		int mode = sc.nextInt();
		
		switch(mode) {
			case 1:
				System.out.println("입금을합니다.");
				break;
			case 2:
				System.out.println("출금을합니다.");
				break;
			case 3:
				System.out.println("잔액을 조회합니다.");
				break;
			default:
				System.out.println("작업을 종료합니다.");
				break;
				
		}

	}

}
