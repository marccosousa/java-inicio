import java.util.Scanner;

public class ex09_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma=0;
		
		int N = sc.nextInt();
		
		double vet[] = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
			soma+=vet[i];
		}
		
		for (int i=0; i<N; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println(soma);
		System.out.println(soma/N);
		
		
		sc.close();

	}

}
