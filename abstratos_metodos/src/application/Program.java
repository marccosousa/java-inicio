package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.printf("Shape #%d data: %n", i);
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK, BLUE OR RED): ");
			sc.nextLine();
			Color color = Color.valueOf(sc.nextLine()); 
			
			if (type == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			
			} else if (type == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius)); 
			
			} 
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Shape Areas: ");
		for (Shape shape : list) {
			System.out.printf("Area: %.2f%n", shape.Area());
		}
		
		sc.close(); 

	}

}
