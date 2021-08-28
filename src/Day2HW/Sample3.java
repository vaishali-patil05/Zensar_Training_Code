package Day2HW;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Week(1-7) : ");
		Byte num=sc.nextByte();
		
		if((num>=1) && (num<=7)){
			System.out.println("Day is Exist");
		}
			
			else  {
				System.out.println("Day Does not exist");
			}
			
		}

}
