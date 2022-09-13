package level3;

import java.util.Scanner;
public class Al_10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		for(; ;) {
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (A != 0 || B != 0) {
				System.out.println(A + B);
			
			} else{ 
					break;
				}
			
			sc.close();
		}
		
	}

}
