package Day2HW;

import java.util.Scanner;

public class NumberIS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
	    int num = sc.nextInt();
	    

      if(num>0) {
          System.out.println("Number is Positive");
      }
      else if(num<0) {
          System.out.println("number is negative");

      }
	}

}
