
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("You don't have enough balance");
	}
	
	public InsufficientBalanceException(String s) {
		super(s);
	}
}
