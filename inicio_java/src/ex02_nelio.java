import java.util.Scanner; 
public class ex02_nelio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1a nome: ");
		String nome1 = sc.nextLine();
		System.out.println("Digite 1a idade: ");
		int idade1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Digite o 2a nome: ");
		String nome2 = sc.nextLine();
		System.out.println("Digite 2a idade: ");
		int idade2 = sc.nextInt();
		
		double media_idade = (idade1 + idade2) / 2.0;
		
		System.out.printf("A média da idade entre %s e %s é de: %.1f", nome1, nome2, media_idade);
		sc.close();
	}

}
