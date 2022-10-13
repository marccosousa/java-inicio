import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		int N = sc.nextInt();
		
		
		for(int i=0; i<N; i++) {
			
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
			if (num2 == 0) {
				
				System.out.println("impossivel divisao");
			} else {
				
				double div = num1/num2;
				System.out.printf("%.1f%n", div);
			}
			
		}
		
		sc.close();

	}
}