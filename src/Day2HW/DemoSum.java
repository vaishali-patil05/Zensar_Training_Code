package Day2HW;

import java.util.Scanner;

public class DemoSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		
		 if((no3>=100)  && (no3<=999)){ 
			System.out.println("Enter Number is Three digit number");
		}
		 else
		 {
			double sum=(no1+no2+no3);
			System.out.println("Sum is : " +sum);
		 }

	}

}
