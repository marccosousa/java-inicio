import java.util.Scanner;

public class ex26_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double vet[] = new double[N];
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();

		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i=0; i<vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
			
		}
		
		sc.close();

	}

}
