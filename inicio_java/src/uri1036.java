import java.util.Scanner;

public class uri1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, R1, R2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
			
		} else {
			R1 = (-b + Math.sqrt(delta)) / (2*a);
			R2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
			
		}
		
		sc.close();
	}

}
