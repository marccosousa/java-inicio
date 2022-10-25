package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.printf("Tax payer #%d data: %n", i);
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
				
			} else if (type == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			System.out.println();
			
		}
		
		System.out.println("TAXES PAID:");
		double soma = 0.0; 
		for(TaxPayer tp : list) {
			System.out.printf("%s: $%.2f%n", tp.getName(), tp.Tax());
			soma += tp.Tax();
		}
		
		System.out.printf("TOTAL TAXES: $%.2f%n", soma);
		
		
			
		
		sc.close();

	}

}
