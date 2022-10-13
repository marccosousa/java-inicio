package application;
import entities.Triangle;

import java.util.Scanner;

public class ex01_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Triangle x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Triangle y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("AREA TRINGLE X: %f%n", areaX);
		System.out.printf("AREA TRINGLE Y: %f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("LARGER AREA: X");
		} else {
			System.out.println("LARGER AREA: Y");
		}
		
		sc.close();
	}

}
