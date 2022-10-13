import java.util.Scanner;

public class ex12_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares=0;
		
		int N = sc.nextInt();
		int vet[] = new int[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
			
			if(vet[i]%2==0) {
				pares++;
			}
		}
		
		for(int i=0; i<N; i++) {
			
			if(vet[i]%2==0) {
				System.out.println(vet[i]);
			}

		}
		
		System.out.println(pares);
		sc.close();

	}

}
