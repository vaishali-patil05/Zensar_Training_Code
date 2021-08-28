package Day3;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		int i=0;
		int sum=0;		
		for(i=num;i<0;i=i/10) {
			sum=sum + i%10;
			System.out.println(sum);
		
		}

	}

}
