package test;

public class Account3 {
	private int balance = 0;
	final static int Min_BLANCE =0;
	final static int MAX_BLANCE =1000000;
	
	public void setBalance(int num) {
		if(num>=this.Min_BLANCE && num<=this.MAX_BLANCE) {
			this.balance += num;
		}
	}
	public int getBalance() {
		return balance;
	}
}
