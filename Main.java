import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("WELCOME TO PIXEL GENERATOR");
		Scanner sc = new Scanner(System.in);
		char stay = 'Y';
		while (stay != 'N') {
			System.out.println("Write position X of Pixel");
			int x = sc.nextInt();
			System.out.println("Write position Y of Pixel");
			int y = sc.nextInt();
			System.out.println("Write the colour R of Pixel");
			int r = sc.nextInt();
			System.out.println("Write the colour G of Pixel");
			int g = sc.nextInt();
			System.out.println("Write the colour B of Pixel");
			int b = sc.nextInt();
			try {
				Pixel p = new Pixel(x, y, r, g, b);
				System.out.println(p.writePixel());
			} catch(ColourRGBException e) {
				System.out.println(e.getMessage());
				System.out.println("Pixel not created");
			}
			System.out.println("Do you want to create anothe Pixel? (Y/N): ");
			stay = sc.next().charAt(0);
		}
		sc.close();
		System.out.println("See you soon");
	}
	
}
