import java.util.Scanner;

public class uri1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		
		X = sc.nextInt();
		Y = sc.nextInt();

		
		while (X != Y) {	
			if (X > Y) {
				System.out.println("Decrescente");
				
			} else {
				System.out.println("Crescente");
		
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();
			
		}
		
		sc.close();
	}

}
