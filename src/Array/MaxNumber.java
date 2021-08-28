package Array;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter " +array.length+ " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		System.out.println("Maximum " + max);
	}

}
