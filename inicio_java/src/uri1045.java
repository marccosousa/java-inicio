import java.util.Scanner; 

public class uri1045 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double lado1, lado2, lado3; 
		
		lado1 = sc.nextDouble();
		lado2 = sc.nextDouble();
		lado3 = sc.nextDouble();
		
		if (lado1 >= lado2+lado3 || lado2 >= lado1+lado3 || lado3 >= lado1+lado2) {
			System.out.println("NÃO FORMA TRIANGULO!");
			
		} else {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("TRIANGULO ISOSCELES");
				
			} else {
				System.out.println("TRIANGULO ESCALENO");
				
			}
			
			
		}
		
		sc.close();

	}

}