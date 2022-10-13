package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() {
		// sobrecarga para que no programa ainda exista o construtor padrão.
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name; 
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // Sobrecarga para que o produto comece sem estoque. 
		this.name = name; 
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	public double getPrice() {
		return price;
	}
	
		
	public int getQuantity() {
		return quantity;
	}


	public double totalValueInStock() {
		return price * quantity;
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return name 
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
	
}

