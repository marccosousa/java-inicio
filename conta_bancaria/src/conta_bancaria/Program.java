package conta_bancaria;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amount; 
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();		
		
		Conta conta1 = new Conta(account, name); 	
		
		System.out.print("Enter initial deposit value (y/n)? ");
		char opcao = sc.next().charAt(0);
		
		if(opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			conta1.depositMoney(amount);
			
		} else {
			conta1.depositMoney(0);
			
		}
		
		System.out.println();
		System.out.println("Account data:");
		conta1.resumo();
		
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		conta1.depositMoney(amount);
		System.out.println("Updated account data: ");
		conta1.resumo();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		conta1.withdrawMoney(amount);
		System.out.println("Updated account data: ");
		conta1.resumo();
		
		
				
		sc.close();
	}

}
