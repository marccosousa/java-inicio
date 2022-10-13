package salario_funcionario;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.print("NOME: ");
		funcionario1.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario1.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		funcionario1.taxa = sc.nextDouble();
		
		System.out.println();
		funcionario1.resumo();
		
		System.out.println();
		System.out.print("Qual percentual quer de aumento? ");
		double perc = sc.nextDouble();
		funcionario1.aumentoSalario(perc);
		
		System.out.println();
		funcionario1.resumo();
		
		
		
		sc.close();

	}

}
