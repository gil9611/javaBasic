package sec3;

public class Account {
	private int balance;
	
	public Account() {}
	
	public int getBalance() {
		return this.balance;

	}
	
	public void setBalance(int bal) {
		this.balance = bal;
	}
	
	public void deposit(int money) {
		this.balance+=money;
	}
	
	public void withdraw(int money) throws BalanceUnderflowException{
		if (this.balance<money) {
			throw new BalanceUnderflowException("잔고 부족. 현재 잔고 : " +(this.balance));
		}
		this.balance -= money;
	}
}
