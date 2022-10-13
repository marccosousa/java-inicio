import java.util.Scanner;

public class uri1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0, max, min, soma=0;
		
		num1 = sc.nextInt();		
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		for (int i=min+1; i<max; i++) {
			if (i%2 != 0) {
				soma+=i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
