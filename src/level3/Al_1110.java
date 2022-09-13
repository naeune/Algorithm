package level3;

import java.util.Scanner;
public class Al_1110 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int count = 0;
		int copy = N;
		int newNumber = 0;
		
		sc.close();
		
		while(true) {
			newNumber = (N%10) * 10 + ((N/10) + (N%10)) % 10;
			count++;
			
			if (newNumber == copy) break;
			N = newNumber;			
		}
		System.out.println(count);
	}
}
