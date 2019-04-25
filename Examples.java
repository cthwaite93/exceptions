import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examples {
	public static void main(String[] args) {
		Account a = new Account(20);
		System.out.println(a.getBalance());
		try {
			a.withdrawal(15);
			System.out.println(a.getBalance());
			a.withdrawal(10);
			System.out.println(a.getBalance()); 
		} catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(a.getBalance());
		}
	}
}
