import java.util.Scanner;

public class ex25_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma=0;
		int N = sc.nextInt();
		double alturas[] = new double[N];
		
		for(int i=0; i<N; i++) {
			System.out.println("Altura " + i);
			alturas[i] = sc.nextDouble();
			soma += alturas[i];
		}
		
		System.out.printf("Altura média: %.2f", soma/N);
		
		sc.close();
	}

}
