package Day3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		
		switch(num%2) {
		case 1:
			System.out.println("Even Number");
		    break;
		    
		case 2:
			System.out.println("odd Number");
		    break;
		    
		 default:  
			 System.out.println("Wrong Input");
			
		}
		sc.close();
	}

}
