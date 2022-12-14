package alturas_classes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitas? ");
		int N = sc.nextInt();
		int menorDeIdade=0; 
		double somaAltura=0;
		Pessoa vet[] = new Pessoa[N];
		
		for(int i=0; i<vet.length; i++) {
			System.out.printf("Dado da %d pessoa: %n", i+1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vet[i] = new Pessoa(nome, idade, altura);
			somaAltura += vet[i].getAltura();
			
			if(vet[i].getIdade() < 16) {
				menorDeIdade++;
			}
		
		}
		double percMenorIdade = menorDeIdade*100/vet.length;
		
		System.out.println();
		System.out.printf("Altura média: %.2f ", somaAltura/vet.length);
		
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percMenorIdade);
				
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
				
			}
		}
		
		
		sc.close();

	}

}
