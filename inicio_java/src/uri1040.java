import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float n1, n2, n3, n4, media, nota_exame, media_final;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();	
		n3 = sc.nextFloat();	
		n4 = sc.nextFloat();
		
		media = (n1*2 + n2*3 + n3*4 + n4*1) / 10;
		
		System.out.printf("Media: %.1f%n", media);
		
		if (media < 5.0) {
			System.out.println("Aluno reprovado.");
			
		} else if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
			
		} else {
			System.out.println("Aluno em exame.");
			nota_exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n",nota_exame);			
			
			media_final = (media + nota_exame) / 2;
			
			if (media_final > 5) {
				System.out.println("Aluno aprovado.");
						
			} else {
				System.out.println("Aluno reprovado.");
				
			}
			
			System.out.printf("Media final: %.1f%n", media_final);
		}
		
		sc.close();
	}

}
