import java.util.Scanner;

public class ex28_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int neg = 0;
		int N = sc.nextInt();
		
		int mat[][] = new int[N][N];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
				if (mat[i][j] < 0) {
					neg++;
					
				}
			}
		}
		
		System.out.println("Negativos: "  + neg);
		
		System.out.println("Diagonal principal:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {				
				if (i==j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		
		
		sc.close();

	}

}
