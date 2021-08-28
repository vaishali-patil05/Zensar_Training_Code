package Day2;

import java.util.Scanner;

public class BuzzNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		
	 if(num%7==0 || num%7==10)
		
		System.out.println(" Buzz ");
		
		else {
			System.out.println("Not Buzz");
		}
		

	}

}
