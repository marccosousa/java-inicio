import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, num_pecas1, num_pecas2;
		double valor1, valor2, total1, total2;
		
		codigo1 = sc.nextInt();
		num_pecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		total1 = num_pecas1 * valor1;
		
		codigo2 = sc.nextInt();
		num_pecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		total2 = num_pecas2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$%.2f%n", total1 + total2);
		
		sc.close();
	}

}
