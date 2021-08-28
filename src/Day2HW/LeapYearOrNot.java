package Day2HW;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		 System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      int year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("leap year");
	      else
	         System.out.println("Year is not a leap year");

	}

}
//If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//The year is a leap year (it has 366 days).
//The year is not a leap year (it has 365 days).