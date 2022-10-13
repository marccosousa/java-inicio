import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, consumo_medio;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		consumo_medio = X / Y;
		
		System.out.printf("%.3f km/l%n", consumo_medio);
		
		sc.close();

	}

}
