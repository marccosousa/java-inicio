package retangulo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret1 = new Retangulo(); 
		
		System.out.println("Altura e largura do retângulo: ");
		ret1.altura = sc.nextDouble(); 
		ret1.largura = sc.nextDouble();
		
		System.out.printf("AREA: %f%n", ret1.area());
		System.out.printf("PERIMETRO: %f%n", ret1.perimetro());
		System.out.printf("DIAGONAL: %f%n", ret1.diagonal());
		
		sc.close();

	}

}
