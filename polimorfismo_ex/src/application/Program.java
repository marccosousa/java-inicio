package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Employee> emps = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.printf("Employee #%d data: %n", i);
			System.out.print("Outsourced (y/n)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(option == 'n') {
				Employee emp = new Employee(name, hours, valuePerHour);	
				emps.add(emp);
				
			} else {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
				emps.add(emp);
			}
		
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		System.out.println(emps);
		
		sc.close();

	}

}
