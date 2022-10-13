import java.util.Scanner;

public class ex17_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma;
		
		int N = sc.nextInt();
		
		String nome[] = new String[N];
		double nota1[] = new double[N];
		double nota2[] = new double[N];
		double media[] = new double[N];
		
		for (int i=0; i<N; i++) {
			
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			
			soma = nota1[i] + nota2[i];
			
			media[i] = soma/2;
			
		}
		
		for (int i=0; i<N; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
