package Day2HW;

import java.util.Scanner;

public class FindMaxThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		if((num>=0)  && (num<=9))
			System.out.println("One Digit number");
			
		else if((num>=10)  && (num<=99))
				System.out.println("Two digit number");
		
			else if((num>=100)  && (num<=999))
		System.out.println("Three Digit number");
		
		else
			System.out.println("Number is above four digit");
				
		
	  
	}

}
