import java.util.Scanner;

public class ex03_nelio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.printf("MEDIA: %.2f -- APROVADO!!%n", media);
			
		} else {
			System.out.printf("MEDIA: %.2f -- REPROVADO!!%n", media);
			
		}

		sc.close();
	}

}
