package level2;

import java.util.Scanner;
public class Al_14681 {

	public static void main(String[] args) {

		int X = 0;
		int Y = 0;
		
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if(X > 0 && Y > 0) {
			System.out.println("1");
		} else if (X < 0 && Y > 0) {
			System.out.println("2");
		} else if (X < 0 && Y < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
	
		sc.close();
	}

}
