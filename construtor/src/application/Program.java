package application;
import entities.Product;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computador");
		System.out.println("Produto atualizado: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Preço atualizado: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product Data: " + product);
		
		System.out.println();
		System.out.println("Add products in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println();
		System.out.println("Removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		sc.close();

	}

}
