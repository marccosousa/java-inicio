package notas;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno alu1 = new Aluno(); 
		
		alu1.nome = sc.nextLine();
		
		alu1.nota1 = sc.nextDouble();
		alu1.nota2 = sc.nextDouble();
		alu1.nota3 = sc.nextDouble();
		double falta = 60 - alu1.Soma();
		
		System.out.println("FINAL GRADE = " + alu1.Soma());
		
		if(alu1.Soma() < 60) {
			System.out.println("FAILED");
			System.out.println("MISSING = " + falta);
			
		} else {
			System.out.println("PASS");
			
		}
		
		sc.close();

	}

}
