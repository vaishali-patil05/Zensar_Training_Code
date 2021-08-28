package Day2HW;

import java.util.Scanner;

public class InputChar {

	public static void main(String[] args) {
		System.out.println("Enter Character :");
	      Scanner sc = new Scanner(System.in);
	      char n=sc.next().charAt(0);
	      
	      
	      if((n>='A'  && n<='Z') || (n>='a'  && n<='z')){
	      
	      System.out.println("This is Alphabet");
	      }
	      else if ((n>='0' && n<='9')) 
	      {
	    	  System.out.println("This is Digit");
	      }
	      else {
	    	  System.out.println("This is Special character");
	      }
	      
	      

	}

}
