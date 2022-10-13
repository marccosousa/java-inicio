import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; 
		
		int qtd_num = sc.nextInt();
		String PosNeg, ParImp;
		
		for(int c=1; c<=qtd_num; c++) {
			num = sc.nextInt();
						
			if (num > 0) {
				PosNeg = "POSITIVE";
			} else {
				PosNeg = "NEGATIVE";
			}
			
			if (num%2==0) {
				ParImp = "EVEN";
			} else {
				ParImp = "ODD";
			}
			
			if (num==0) {
				System.out.println("NULL");
			} else {
				System.out.printf("%s %s%n", ParImp, PosNeg);
			}
			
		}
		
		sc.close();

	}

}

