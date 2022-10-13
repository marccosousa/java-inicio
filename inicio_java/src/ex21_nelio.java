import java.util.Scanner;

public class ex21_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int negativos=0;
		
		int N = sc.nextInt();
		
		int mat[][] = new int [N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
				
				if (mat[i][j] < 0) {
					negativos++;
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i=0; i<N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("NEGATIVOS:" + negativos);
		sc.close();

	}

}
