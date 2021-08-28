package Day4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a character :");
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      
	      while(n>0)  //(n!=0) is also condition
	      {
	    	  int r=n%10;
	    	  System.out.println(r);
	    	  n=n/10;
	    	  
	      }

	}

}
