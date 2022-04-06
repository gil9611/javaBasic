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
			
			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
	
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
		System.out.println("");
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
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}
	
	//예금								//계좌확인 절차 넣을것.
	private static void deposit() {
		int sum = 0;
		
		System.out.println("--");
		System.out.println("예금");
		System.out.println("--");
		System.out.print("계좌번호: ");
		String Ano1 = scanner.next();
		System.out.print("예금액: ");
		int Balance1 = scanner.nextInt();
		
		Account ac = findAccount(Ano1);		//따로 지정을 해주자...?
		
		sum =ac.getBalance() + Balance1;
		ac.setBalance(sum);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금
	private static void withdraw() {
		int sum = 0;
		
		System.out.println("--");
		System.out.println("출금");
		System.out.println("--");
		System.out.print("계좌번호: ");
		String Ano1 = scanner.next();
		System.out.print("예금액: ");
		int Balance1 = scanner.nextInt();
		
		Account ac = findAccount(Ano1);
		
		sum =ac.getBalance() - Balance1;
		ac.setBalance(sum);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		int find = 0;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(ano)) {		//equals 꼭 기억하자
				find = i;
				break;										//이거.
			}
		}
		return accountArray[find];
		
	}

}
