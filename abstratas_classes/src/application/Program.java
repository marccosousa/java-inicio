package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		//Account acc1 = new Account(1001,"MARCO", 1000.00); Tipo account não pode ser instanciado. (classe abstrata)
		
		list.add(new BusinessAccount(1001, "Maria", 1000.00, 500.00));
		list.add(new SavingsAccount(1002, "Joana", 900.00, 0.01));
		list.add(new BusinessAccount(1003, "João", 800.00, 500.00));
		list.add(new SavingsAccount(1004, "José", 700.00, 0.01));
		
		double soma = 0.0; 
		
		for(Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.printf("Soma das contas: %.2f%n", soma);
		
		for (Account acc : list) {
			acc.deposit(100.00);
		}
		
		for(Account acc : list) {
			System.out.printf("CONTA: %d Saldo: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
