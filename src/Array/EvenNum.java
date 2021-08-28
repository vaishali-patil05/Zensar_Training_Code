package Array;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter " + array.length + " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int even = 0;
		 {
			
			for (int i = 0; i < array.length; i++)
				if (array[i] % 2 == 0)
					even++;
			System.out.println(array);
			
		
	}

	}
}
