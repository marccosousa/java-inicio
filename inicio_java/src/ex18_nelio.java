import java.util.Scanner;

public class ex18_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float menor_alt=0, maior_alt=0, soma_alt=0; 
		int homens=0, mulheres=0;
		
		int N = sc.nextInt();
		
		float altura[] = new float[N];
		char sexo[] = new char[N];
		
		for(int i=0; i<N; i++) {
			altura[i] = sc.nextFloat();
			sexo[i] = sc.next().charAt(0);
			
			if(i==0) {
				menor_alt = altura[0];
				maior_alt = altura[0];
			}
			
			if (altura[i] < menor_alt) {
				menor_alt = altura[i];
				
			} else if (altura[i] > maior_alt) {
				maior_alt = altura[i];
				
			}
			
			if (sexo[i] == 'F') {
				soma_alt += altura[i];
				mulheres++;
				
			} else {
				homens++;
			}
		}
		
		System.out.println("Menor altura = " + menor_alt);
		System.out.println("Maior altura = " + maior_alt);
		System.out.println("Media da alturas femininas = " + soma_alt/mulheres);
		System.out.println("Numero de homens = " + homens);
		
		sc.close();

	}

}
