package level2;

import java.util.Scanner;
public class Al_1330 {
	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			System.out.println(">");
		}
		else if (A == B) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}
		
		sc.close();
	}
}
