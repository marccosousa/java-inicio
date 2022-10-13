import java.util.Scanner;

public class uri1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maior, menor, soma=0;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		menor = num1; 
		maior = num2;
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		}
		
		for (int i = menor; i <= maior; i++) {
			
			if (i%13 != 0) {
				soma += i;
			}
		}
		
		System.out.printf("%d%n", soma);		
		
		sc.close();

	}

}
