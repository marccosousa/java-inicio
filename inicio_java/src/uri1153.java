import java.util.Scanner;

public class uri1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = num-1; i >= 1; i--) {
			num *= i;
			
		}
		
		System.out.println(num);
		sc.close();

	}

}
