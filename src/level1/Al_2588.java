package level1;

import java.util.Scanner;
public class Al_2588 {

	public static void main(String[] args) {

		int A = 472;
		int B = 385;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(A * (B % 10));
		System.out.println(A * ((B % 100) / 10));
		System.out.println(A * ((B % 1000) / 100));
		System.out.println(A * B);
	
		sc.close();
		
	}

}
