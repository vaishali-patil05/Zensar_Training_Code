package TwoDArray;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		System.out.println(a.length);
		System.out.println(a[0].length);

		Scanner sc = new Scanner(System.in);

		for (int r = 0; r < a.length; r++) {
			System.out.println("Enter the element of rows :" +r);
			for (int c = 0; c < a[r].length; c++) {
				a[r][c] = sc.nextInt();
			}
			
		}for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] +" ");
			}
			System.out.println();
		}
		
		

	}

}
