import java.util.Scanner;

public class ex15_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma=0, pares=0; 
		double media;
		
		int N = sc.nextInt();
		
		int vet[] = new int[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
			
			if(vet[i]%2==0) {
				soma+=vet[i];
				pares++;
			}
		}
		
		media = (double)soma/pares;
		System.out.println(media);
		
		sc.close();

	}

}
