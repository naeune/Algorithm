package level2;

import java.util.Scanner;
public class Al_2525 {

	public static void main(String[] args) {
		
		int H = 0;
		int M = 0;
		int time = 0;
		int hour = 0;

		
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		M = sc.nextInt();
		time = sc.nextInt();
		
		hour = (M + time) / 60;
		
			
			if((M + time) < 60) {
				System.out.println(H);
				System.out.println(M + time);
				
			} else if ((M + time) >= 60) {
				if((M + time) / 60 >= 1) {
					if((H + hour) >= 24) {
						System.out.println((H + hour) - 24);
						System.out.println((M + time) - (60 * hour));
					} else {
					System.out.println(H + hour);
					System.out.println((M + time) - (60 * hour));
					}
				} else {
				System.out.println(H + 1);
				System.out.println((M + time) - 60);
				}
			}
			sc.close();
	}
}

