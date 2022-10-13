import java.util.Scanner;

public class ex14_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float soma=0, media;
		
		int N = sc.nextInt();
		
		float vet[] = new float[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextFloat();
			soma += vet[i];			
		}
		
		media = soma/N;
		System.out.println(media);
		
		for(int i=0; i<N; i++) {
			if(vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
