package vetor_classe;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma=0; 
		
		int N = sc.nextInt();	
		Product vet[] = new Product[N];
		
		for(int i=0; i<vet.length; i++) {
			String name = sc.nextLine();
			sc.nextLine();		
			double price = sc.nextDouble();

			vet[i] = new Product(name,price);
			soma += vet[i].getPrice();
					
		}
		
		double media = soma / vet.length;
		
		System.out.printf("Media: %.2f", media);
		
		sc.close();

	}

}
