import java.util.Scanner;

public class ex05_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma=0, qnum=0;
		
		num = sc.nextInt();
		
		while (num >= 0) {
			soma += num;
			qnum++;
			num = sc.nextInt();
	
		}
		
		if (qnum > 0) {
			System.out.printf("media = %.2f%n", (double)soma/qnum);		
		
		} else {
			System.out.println("Impossivel calcular");
			
		}
		
		sc.close();

	}

}
