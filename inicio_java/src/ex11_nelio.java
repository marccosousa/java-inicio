import java.util.Scanner;

public class ex11_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior=0, PosMaior=0;
		
		int N = sc.nextInt();
		int vet[] = new int[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
			
			if (i == 0) {
				maior = vet[i];
			}
			
			if(vet[i] > maior) {
				maior = vet[i];
				PosMaior = i;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(PosMaior);
		sc.close();

	}

}
