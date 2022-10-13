import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double n1, n2, n3, media=0;
		
		for(int i=0; i<N; i++) {
			
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			media = (n1*2 + n2*3 + n3*5)/10;
			
			System.out.printf("%.1f%n", media);
		}
		
		
		
		sc.close();

	}

}
