package Day2HW;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		Byte num=sc.nextByte();
		
		if(num==1) {
			System.out.println("one");
		}
		else if(num==2) {
			System.out.println("Two");
		}
		else if(num==3) {
			System.out.println("Three");
		}
		else if(num==4) {
			System.out.println("Four");
		}
		else if(num==5) {
			System.out.println("Five");
		}
		else {
			System.out.println("Number Does not Exist");
		}
	}

}
