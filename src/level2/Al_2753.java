package level2;

import java.util.Scanner;
public class Al_2753 {

	public static void main(String[] args) {
		int year = 0;
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("1");
		}
		else if (year % 400 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
