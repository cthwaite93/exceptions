public class Account {
	
	private float balance;
	
	public Account() {
		this.balance = 0;
	}
	
	public Account(float c) {
		this.balance = c;
	}
	
	public void deposit(float c) {
		this.balance += c;
	}
	
	public void withdrawal(float c) {
		this.balance -= c;
	}

	public float getBalance() {
		return balance;
	}
}