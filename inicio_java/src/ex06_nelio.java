import java.util.Scanner;

public class ex06_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma=0, valores; 
		
		int num = sc.nextInt();
		
		for(int c=1;c<=num;c++) {
			valores = sc.nextInt();
			soma += valores;
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
