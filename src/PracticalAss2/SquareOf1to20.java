package PracticalAss2;

import java.util.Scanner;

public class SquareOf1to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer number: ");
		int num = sc.nextInt();

		System.out.println("Square of " + num + " is: " + Math.pow(num, 2));

	}

}
