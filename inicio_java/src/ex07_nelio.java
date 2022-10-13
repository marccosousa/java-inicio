import java.util.Scanner;

public class ex07_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for (int i=0; i<N; i++) {
			System.out.println(vet[i]);
		}
				
		sc.close();

	}

}
