import java.util.Scanner; 

public class ex01_nelio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double base, altura, perimetro, area, diagonal;
		
		System.out.println("Digite a base do retângulo: ");
		base = sc.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
		
		area = base * altura; 
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("ÁREA = %.4f%n", area);
		System.out.printf("PERÍMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
	}

}
