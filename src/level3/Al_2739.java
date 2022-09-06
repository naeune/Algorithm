package level3;

import java.util.Scanner;
public class Al_2739 {

	public static void main(String[] args) {
		
		int N = 0;
		int X = 0;

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		sc.close();	
		
		for (X = 1; X <= 9; X++) {
			System.out.println(N + " * " + X + " = " + (N * X) );
		}
		

	}
}
