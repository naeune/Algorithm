package level2;

import java.util.Scanner;
public class Al_2884 {

	public static void main(String[] args) {
		
		int H = 0;
		int M = 0;
		
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		M = sc.nextInt();
		
		if (M >= 45) {
			System.out.println(H);
			System.out.println(M - 45);
		} else if (H > 0 && M < 45) {
			System.out.println(H - 1);
			System.out.println(M - 45 + 60);
		} else if (H == 0 && M < 45) {
			H = 23;
			System.out.println(H);
			System.out.println(M - 45 + 60);
			
			// System.out.println(H + " " + (M - 45 + 60));
		}
		
		sc.close();
	}

}
