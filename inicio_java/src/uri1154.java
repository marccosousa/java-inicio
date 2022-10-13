import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, qtd_idades = 0, soma = 0;
		
		idade = sc.nextInt();
		
		while (idade >= 0) {
			soma += idade;
			qtd_idades++;
			idade = sc.nextInt();
			
		}
		
		float media = (float)soma/(float)qtd_idades;
		
		System.out.printf("%.2f%n",media);
		
		sc.close();

	}

}
