import java.util.Scanner;

public class maiormenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior=0, menor=0;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		
		} else if (num2 > num3) {
			maior = num2; 
		
		} else {
			maior = num3;
		}
		
		if (num1 < num2 && num1 < num3) {
			menor = num1;
		
		} else if (num2 < num3) {
			menor = num2; 
		
		} else {
			menor = num3;
		}
		
		System.out.printf("%d %d", menor, maior);
		
		sc.close();
		

	}

}
