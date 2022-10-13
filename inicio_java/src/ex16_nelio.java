import java.util.Scanner;

public class ex16_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome_maior="";
		int maior=0;
		
		int N = sc.nextInt();
		
		String nomes[] = new String[N];
		int idades[] = new int[N];
		
		for (int i=0; i<N; i++ ) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			
			if (i==0) {
				maior = idades[0];
				nome_maior = nomes[0];
			}
			
			if(idades[i] > maior) {
				nome_maior = nomes[i];
				maior = idades[i];
			}
			
		}
		
		System.out.printf("Pessoa mais velha: %s%n", nome_maior);
		sc.close();

	}

}
