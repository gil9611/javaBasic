package sec3;
//사용자 예외처리 만들기.
public class BalanceUnderflowException extends Exception{
	public BalanceUnderflowException() {}
	public BalanceUnderflowException(String message) {
		super(message);
	}
}
