package level2;

import java.util.Scanner;

public class Al_2480 {

	public static void main(String[] args) {
		
		int X = 0;
		int Y = 0;
		int Z = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		
		
		if (X == Y && Y == Z) {
			System.out.println(10000 + X * 1000);
		}
		else if (X == Y || Y == Z || Z == X) {
			if (X == Y) {
				System.out.println(1000 + X * 100);
			} else if (Y == Z) {
				System.out.println(1000 + Y * 100);
			} else if (Z == X) {
				System.out.println(1000 + Z * 100);
			}
		} else {
			if (X > Y && X > Z) {
				System.out.println(X * 100);
			} else if (Y > X && Y > Z) {
				System.out.println(Y * 100);
			} else if (Z > Y && Z > X) {
				System.out.println(Z * 100);
			}
		}
			
		
		sc.close();
	}

}
