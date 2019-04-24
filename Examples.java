import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examples {
		
	static void printReader(BufferedReader br) throws IOException {
		String n = br.readLine();
		System.out.println(n);
	}
	
	static void writeRead() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			printReader(br);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static int divideByZero(int a, int b) {
		int i = a / b;
		return i;
	}
	
	
	static int computeDivision(int a, int b) {
		int res = 0;
		try
		{
			res = divideByZero(a, b);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("NumberFormatException has occured");
		}
		
		return res;
	}
	
	static void joyDivision() {
		int a = 1;
		int b = 0;
		try
		{
			int i = computeDivision(a, b);
			System.out.println("Division result is: " + i);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("CADA VEZ QUE DIVIDO ENTRE 0, UNA DE MIS NEURONAS SUCUMBE EN UN AGUJERO NEGRO");
		}
	}
	
	public static void main(String[] args) {
		writeRead();
        joyDivision();
	}
}
