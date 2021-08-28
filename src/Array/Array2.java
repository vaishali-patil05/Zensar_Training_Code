package Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] namearra = new int[10];

		System.out.println("Enter number :");
		int count = 0;

		for (int j = 0; j <= 9; j++) {
			namearra[j] = sc.nextInt();

		}
		for (int j = 0; j < 9; j = j + 2)

			System.out.println(namearra[j]);

	}

}
