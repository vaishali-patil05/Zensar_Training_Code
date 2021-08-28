package TwoDArray;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
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
			System.out.println(" ");
		}
		  int n = 0;
		for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
               
                // Condition for secondary diagonal
                if ((r + c) == (n - 1)) {
                    System.out.print(a[r][c] + ", ");
                }
            }
        }
        System.out.println("");
    }
	}

