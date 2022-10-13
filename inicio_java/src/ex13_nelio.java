import java.util.Scanner;

public class ex13_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int vet1[] = new int[N];
		int vet2[] = new int[N];
		int soma[] = new int[N];
		
		for(int i=0; i<N; i++) {
			vet1[i] = sc.nextInt();
			vet2[i] = sc.nextInt();
			
			soma[i] = vet1[i] + vet2[i];
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(soma[i]);
		}
		
		sc.close();
		
	}

}
