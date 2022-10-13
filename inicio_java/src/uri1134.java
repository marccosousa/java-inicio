import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool=0, gasolina=0, diesel=0, opcao;
		
		opcao = sc.nextInt();
		
		while (opcao != 4) {
			if (opcao == 1) {
				alcool++;
				
			} else if (opcao == 2) {
				gasolina++;
				
			} else if (opcao == 3) {
				diesel++;
				
			} 
			
			opcao = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		sc.close();
		
	}
}