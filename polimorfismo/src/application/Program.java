package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(2222, "Marco", 1000.00);
		Account y = new SavingsAccount(3333, "Joao", 1000.00, 0.02);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
