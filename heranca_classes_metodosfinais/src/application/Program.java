package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Marcola" , 0.0); 
		BussinessAccount bacc = new BussinessAccount(2022, "Marquinho", 0.0, 1000.00);
		
		// UP CASTING
		
		Account acc1 = bacc; 
		Account acc2 = new BussinessAccount(3033, "Bobao", 0.0, 500.00);
		Account acc3 = new SavingsAccount(4044, "Marcolito", 0.0, 500.00); 
		
		// DOWN CASTING
		
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.loan(300.00);
		
		// BussinessAccount acc5 = (BussinessAccount)acc3; 
		
		if (acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3; 
			acc5.updateBalance();
			//System.out.println("Updated!!");
		}
		
		Account acc10 = new Account(5555, "Pai", 100.00);
		acc10.withdraw(30.00);;
		System.out.println(acc10.getBalance());
		
		Account acc12 = new SavingsAccount(7777, "Maria", 100.00, 0.01);
		acc12.withdraw(30.00);
		System.out.println(acc12.getBalance());
		
		Account acc13 = new BussinessAccount(8888, "Test", 100.00, 100.00);
		acc13.withdraw(30.00);
		System.out.println(acc13.getBalance());
		
		
	}

}
