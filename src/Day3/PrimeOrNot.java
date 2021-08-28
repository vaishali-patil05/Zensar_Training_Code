package Day3;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int num=sc.nextInt();
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Num is Prime");
		else {
			System.out.println("Not Prime");
		}
	}

}
