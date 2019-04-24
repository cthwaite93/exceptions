import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examples {
	private static void printBuffer(BufferedReader bf) throws IOException {
		String n = bf.readLine(); //can generate an exception
	}
	
	private static void writeRead() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			printBuffer(bf);
		} catch (IOException e) {
			System.out.println("Read error");
		}
	}
	
	public static void main(String[] args) {
		writeRead();
	}
}
