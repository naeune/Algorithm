package level1;

import java.util.Scanner;
public class Al_3003 {

	public static void main(String[] args) {

		int king = 0;
		int queen = 0;
		int rook = 0;
		int bishop = 0;
		int knight = 0;
		int pawn = 0;
		
		Scanner sc = new Scanner(System.in);
		
		king = sc.nextInt();
		queen = sc.nextInt();
		rook = sc.nextInt();
		bishop = sc.nextInt();
		knight = sc.nextInt();
		pawn = sc.nextInt();
		
		System.out.println(1 - king);
		System.out.println(1 - queen);
		System.out.println(2 - rook);
		System.out.println(2 - bishop);
		System.out.println(2 - knight);
		System.out.println(8 - pawn);
		
		sc.close();
		
	}

}
