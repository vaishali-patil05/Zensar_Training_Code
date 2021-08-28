package Array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] namearray = new String[5];

		System.out.println("Enter String :");
		for (int i = 0; i <= 4; i++) {
			namearray[i] = sc.next();

		}
		for (int i = 0; i <= 4; i++)

			System.out.println(namearray[i]);

		int[] namearra = new int[5];

		System.out.println("Enter number :");

		for (int j = 0; j <= 4; j++) {
			namearra[j] = sc.nextInt();

		}
		for (int j = 4; j >= 0; j--)

			System.out.println(namearra[j]);

	}
}
