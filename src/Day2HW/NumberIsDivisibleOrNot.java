package Day2HW;

import java.util.Scanner;

public class NumberIsDivisibleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the number: ");
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();

	      if ((num%5==0)  || (num%11==0))
	         System.out.println("Number is divisible");
	      else
	         System.out.println("Number is not divisible");
	}

}
