package Day2HW;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter number :");
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      
	      if(n%2==0) {
	    	  System.out.println("This is Even number");
	      }
	      else {
	    	  System.out.println("This is odd number");
	      }
	}

}
