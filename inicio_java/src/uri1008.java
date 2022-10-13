import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas_trabalhadas;
		double sal_hora, salario;
		
		numero = sc.nextInt();
		horas_trabalhadas = sc.nextInt();
		sal_hora = sc.nextDouble();
		salario = horas_trabalhadas*sal_hora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numero, salario);
		
		sc.close();

	}

}
