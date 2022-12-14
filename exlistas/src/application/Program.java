package application;
import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int salaryid = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == salaryid).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist.");
			
		} else {
			System.out.print("Enter the percentage: ");
			double perc = sc.nextDouble();
			emp.increaseSalary(perc);
			
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}
				
		
		sc.close();

	}

}
