import java.util.Scanner;

public class ex10_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menor16=0;
		float percmenor;
		double TotAltura=0;
		
		int N = sc.nextInt();
		
		String nome[] = new String[N];
		int idade[] = new int[N];
		double altura[] = new double[N];
		
		for(int i=0; i<N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
			
			TotAltura += altura[i];
			
			if(idade[i] < 16) {
				menor16++;
			}
		}
		
		percmenor = (100*menor16) / N;
		
		System.out.println(TotAltura/N);
		System.out.printf("%.2f%%%n", percmenor);
				
		sc.close();
		
	}

}
