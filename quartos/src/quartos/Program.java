package quartos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quarto vet[] = new Quarto[10];

		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		for (int i = 0; i<N; i++) {
			System.out.println();
			System.out.printf("Rent #%d%n", i+1);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vet[room] = new Quarto(name, email, room);
						
		}
		
		System.out.println();
		for (int i = 0; i<vet.length; i++) {
			if (vet[i] != null) {
				vet[i].resumo();
			}
		}
		
		sc.close();

	}

}
