import java.util.Scanner;

public class ex24_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Digite o número: ");
		double num = sc.nextDouble();	
		System.out.println("1 - Potencia / 2 - Raíz");
		int opcao = sc.nextInt();
		
		double potencia = potencia(num);
		double raiz = raiz(num);
		
		if (opcao == 1) {
			System.out.println(potencia);
			
		} else if (opcao == 2) {
			System.out.println(raiz);
			
		} else {
			System.out.println("Opcao errada, tente novamente");
		}
		
		sc.close();
	}
	
	public static double potencia(double num) {
		double res; 
		res = num*num;
		return res; 
	}
	
	public static double raiz(double num) {
		double res; 
		res = Math.sqrt(num);
		return res;
	}

}
