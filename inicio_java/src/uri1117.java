import java.util.Scanner;

public class uri1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		float nota1 = sc.nextFloat();
		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextFloat();
		}
		
		float nota2 = sc.nextFloat();
		while (nota2 < 0.0 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextFloat();
		}
		
		float media = (nota1 + nota2) / 2;
		
		System.out.printf("media = %.2f%n", media);
		
		sc.close();
		

	}

}
