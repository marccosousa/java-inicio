package conversor;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do dólar: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dólares você quer comprar? ");
		double qtd_dolar = sc.nextDouble();
		
		double valor = Converter.conversor(dolar, qtd_dolar);
		
		System.out.printf("Valor em reais = %.2f", valor);
		
		sc.close();

	}

}
