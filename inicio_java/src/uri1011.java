import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio, volume;
		
		raio = sc.nextDouble();
		
		volume = (double)(4 * pi * Math.pow(raio, 3))/3;
		
		System.out.printf("VOLUME = %.3f%n", volume);	
		
		sc.close();
	}

}
