import java.util.Scanner;

public class ex19_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abaixo_10=0, abaixo_20=0, acima_20=0;
		double soma_compras=0, soma_vendas=0, lucrotot=0;
		
		int N = sc.nextInt();
		
		String produtos[] = new String[N];
		double compras[] = new double[N];
		double vendas[] = new double[N];
		double perclucro[] = new double[N];
		
		for(int i=0; i<N; i++) {
			produtos[i] = sc.next();
			compras[i] = sc.nextDouble();
			vendas[i] = sc.nextDouble();
			
			soma_compras+=compras[i];
			soma_vendas+=vendas[i];		
			lucrotot = soma_vendas - soma_compras;	
			perclucro[i] = (vendas[i] - compras[i])/compras[i]*100;
			
			if (perclucro[i] < 10.0) {
				abaixo_10++;
				
			} else if (perclucro[i] <= 20.0) {
				abaixo_20++;
				
			} else {
				acima_20++;
				
			}
				
		}
		
		System.out.printf("Lucro abaixo de 10%%: %d%n", abaixo_10);
		System.out.printf("Lucro entre 10%% e 20%%: %d%n", abaixo_20);
		System.out.printf("Lucro acima de 20%%: %d%n", acima_20);
		System.out.printf("Valor total da compra: %.2f%n", soma_compras);
		System.out.printf("Valor total da venda: %.2f%n", soma_vendas);
		System.out.printf("Lucro total: %.2f%n", lucrotot);
		sc.close();

	}

}
