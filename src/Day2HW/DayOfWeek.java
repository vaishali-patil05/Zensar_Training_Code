package Day2HW;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Week(1-7) : ");
		Byte num=sc.nextByte();
		
		if(num==1) {
			System.out.println("Monday");
		}
		else if(num==2) {
			System.out.println("Tuesday");
		}
		else if(num==3) {
			System.out.println("Wednesday");
		}
		else if(num==4) {
			System.out.println("Thursday");
		}
		else if(num==5) {
			System.out.println("Friday");
		}
		else if(num==6) {
			System.out.println("Saturday");
		}
		else if(num==7) {
			System.out.println("Sunday");
		}
	}

}
