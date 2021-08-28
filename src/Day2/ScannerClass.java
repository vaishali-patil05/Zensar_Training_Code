package Day2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers : ");
		int no1=sc.nextInt();
	    short no2 =sc.nextShort();
	    byte no3=sc.nextByte();
		
		System.out.println("Enter Name : ");
		String nm = sc.next();
		
		System.out.println("Enter Height : ");
		float h=sc.nextFloat();
		
		System.out.println(" Enter gender : ");
		char g = sc.next().charAt(0);
		
		System.out.println(" Enter Mobile Number : ");
		long mb = sc.nextLong();
	
		System.out.println("Addition :" +(no1+no2+no3));
		System.out.println("Name : " +nm);
		System.out.println("Height :" + h);
		System.out.println("Gender :" + g);
		System.out.println("Mobile number :" + mb);
		
		
		
		
	}

}
