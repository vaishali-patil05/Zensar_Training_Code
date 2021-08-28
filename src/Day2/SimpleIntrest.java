package Day2;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of P : ");
		int p=sc.nextInt();
		
		System.out.println("Enter Value of R : ");
		float r=sc.nextFloat();
		
		System.out.println("Enter Value of T: ");
		byte t = sc.nextByte();
	    
	    
		 float SI =(p*r*t)/100;
		
		System.out.println("Simple intrest is : " +SI);
		
		
	}

}
