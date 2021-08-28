package PracticalAss2;
import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int count = 0;
		  System.out.println("Enter the number :");
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  

		    while (num != 0) {
		      // num = num/10
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);
	}

}
