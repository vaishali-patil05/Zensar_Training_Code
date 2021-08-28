package ArrayAssign;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 145, 85, 45, 80, 5, 8 };

		for (int k = 0; k < a.length; k++) {
			for (int i = 0; i <= 4; i++) {
				if (a[i] > a[i + 1]) {
					int t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}

			}

		}
		System.out.println(Arrays.toString(a));
	}
}
