package level3;

import java.util.Scanner;
public class Al_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			int x = a + b;
			
			System.out.println("Case #" + i + ": " + x);
			
		}
			sc.close();
	}

}
