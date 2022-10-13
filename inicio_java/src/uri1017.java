import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int tempo_viagem, Vm;
		double distancia;		
		
		tempo_viagem = sc.nextInt();
		Vm = sc.nextInt();
		distancia = tempo_viagem * Vm;
		
		System.out.printf("%.3f%n", distancia / 12);
		
		sc.close();

	}

}
