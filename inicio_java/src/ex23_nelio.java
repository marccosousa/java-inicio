import java.util.Scanner;

public class ex23_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Three numbers..");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int num1, int num2, int num3) {
		int res; 
		
		if (num1 > num2 && num1 > num3) {
			res = num1;
			
		} else if (num2 > num3) {
			res = num2;
			
		} else {
			res = num3;
	
		}
		return res;
	
	}
	
	public static void showResult(int higher) {
		System.out.println("Higher = " + higher);
	}
	
	
}
