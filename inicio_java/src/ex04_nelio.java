import java.util.Scanner;

public class ex04_nelio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, soma=0;
		
		num = sc.nextInt();
		
		while (num != 0) {
			soma += num;	
			num = sc.nextInt();
		}

		System.out.printf("Soma = %d%n", soma);
		
		sc.close();
	}

}
