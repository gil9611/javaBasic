package test;
import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("--");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			switch(selectNo){
			case 1: 
				createAccount();
				break;
			case 2: 
				accountList();
				break;
			case 3: 
				deposit();
				break;
			case 4: 
				withdraw();
				break;
			case 5: 
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성
	private static void createAccount() {
		int count = 0;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				count++;
			} else {
				break;
			}
		}
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String Ano1 = scanner.next();
		System.out.print("계좌주: ");
		String Owner1 = scanner.next();
		System.out.print("초기입금액: ");
		int Balance1 = scanner.nextInt();
		System.out.println("");
		accountArray[count] = new Account(Ano1, Owner1, Balance1);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	private static void accountList() {
		System.out.println("--");
		System.out.println("계좌목록");
		System.out.println("--");
		System.out.println("계좌번호\t계좌주\t예치금");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String ano = accountArray[i].getAno();
				String owner =accountArray[i].getOwner();
				int balance = accountArray[i].getBalance();
				System.out.println(ano+"\t"+owner+"\t"+balance);
			} else {
				break;
			}
		}
	}
	//예금								
	private static void deposit() {
		int sum = 0;
		
		System.out.println("--");
		System.out.println("예금");
		System.out.println("--");
		System.out.print("계좌번호: ");
		String Ano1 = scanner.next();
		System.out.print("예금액: ");
		int Balance1 = scanner.nextInt();
		
		Account ac = findAccount(Ano1);		
		if (ac == null){
			System.out.println("계좌번호가 잘못 되었습니다.");
		} else{
		sum =ac.getBalance() + Balance1;
		ac.setBalance(sum);
		System.out.println("결과: 예금이 성공되었습니다.");
		}
	}
	
	//출금
	private static void withdraw() {
		int sum = 0;
		
		System.out.println("--");
		System.out.println("출금");
		System.out.println("--");
		System.out.print("계좌번호: ");
		String Ano1 = scanner.next();
		System.out.print("출금액: ");
		int Balance1 = scanner.nextInt();
		Account ac = findAccount(Ano1);
		sum =ac.getBalance() - Balance1;
		if(sum>=0){
			ac.setBalance(sum);
			System.out.println("결과: 출금이 성공되었습니다.");
		} else{
			System.out.println("예치금이 모자랍니다.");
		}
	}
	//찾기
	private static Account findAccount(String ano) {
		Account ac = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(ano)) {		//equals 꼭 기억하자
				ac = accountArray[i];
				break;										//이거.
			}
		}
		return ac;
		
	}

}
