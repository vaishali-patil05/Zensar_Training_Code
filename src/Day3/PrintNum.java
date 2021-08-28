package Day3;

import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		
		int t=1;
		for(int i=1;i<=num;i++) {
		 t=t*2+1;
			System.out.println(t);
					
			
		}

	}

}
