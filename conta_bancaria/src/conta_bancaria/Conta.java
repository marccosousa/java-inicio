package conta_bancaria;

public class Conta {
	private int account;
	private String name; 
	private double balance;
	
	public Conta(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public int getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public double depositMoney(double amount) {
		return this.balance += amount;
	}
	
	public double withdrawMoney(double amount) {
		return this.balance -= amount + 5 ;
	}
	
	void resumo() {
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f%n%n", account, name, balance);
	}
	
		
		
}
