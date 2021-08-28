package Day4;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character :");
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      
	      int c=0;
	      int a=n;
	      while(n>0) {
	    	  c++;
	    	  n=n/10;
	      }
	      n=a;
	      int sum=0;
	      while(n>0) {
	    	  int r=n%10;
	    	  sum=sum+(int)Math.pow(r, c);
	    	  n=n/10;
	      }
	      if(sum==0) 
	    	  System.out.println("Armstrong Number");
	      
	      else 
	    	  System.out.println("Not Armstrong");
	      

	}

}
