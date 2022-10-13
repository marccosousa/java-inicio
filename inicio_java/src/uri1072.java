import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0, qtd_valores, valores, out=0, in=0;
		
		qtd_valores = sc.nextInt();
		
		while (c < qtd_valores) {		
			valores = sc.nextInt();
			
			if (valores < 10 || valores > 20) {
				out++;
				
			} else {
				in++;
			}
			
			c++;
		} 
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		
		sc.close();

	}

}
