import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examples {
	private static void printBuffer(BufferedReader bf) throws IOException {
		String n = bf.readLine(); //can generate an exception
		System.out.println(n);
	}
	
	private static void writeRead() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			printBuffer(bf);
		} catch (IOException e) {
			System.out.println("Read error");
		}
	}
	
    private static int divideByZero(int a, int b){  
        int i = a/b;  
          
        return i; 
    } 
      
    private static int computeDivision(int a, int b) {    
        int res =0; 
        try
        { 
          res = divideByZero(a,b); 
        } catch(NumberFormatException ex) { 
           System.out.println("NumberFormatException is occured");  
        } 
        return res; 
    }
    
    private static void joyDivision() {
    	int a = 1;
    	int b = 0;
    	try {
    		System.out.println(computeDivision(a, b));
    	} catch (ArithmeticException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	public static void main(String[] args) {
		writeRead();
		joyDivision();
	}
}
