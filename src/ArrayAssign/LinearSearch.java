package ArrayAssign;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 5, 5, 7, 8, 4 };
		System.out.println("Enter Element to be search :");
		int nm = sc.nextInt();
		int found = 0;

		for (int i = 0; i <= a.length; i++) {
			if (nm == a[i]) {
				found = 1;
				System.out.println("Element is present at position" + i);
			}

		}
		if (found == 0)
			System.out.println("Element is not present");

	}

}
