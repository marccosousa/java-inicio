import java.util.Scanner; 

public class uri1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nome; 
		double salario, vendas, comissao, total_mes;
		
		nome = sc.nextLine();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		comissao = vendas * 0.15;
		total_mes = salario + comissao;
					
		System.out.printf("TOTAL = R$ %.2f%n", total_mes);
		
		sc.close();
	}

}
