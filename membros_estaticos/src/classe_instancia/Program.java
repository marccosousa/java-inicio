package classe_instancia;
import java.util.Scanner;

// Usando outra classe, usando métodos de instância. (Classe calculator); 

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio); 
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.println("Value PI: " + calc.PI);
		
		sc.close();
	}

}

