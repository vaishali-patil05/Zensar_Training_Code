package ArrayAssign;

import java.util.Arrays;
import java.util.Scanner;

public class Min_MaxValu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] nums={6,-1,-2,-3,0,1,2,3,4};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);*/
		 Scanner sc=new Scanner(System.in);
	       int arr[]=new int[10];
	       System.out.println("Enter elements in array");
	       int min=0;
	       int max=0;
	       for(int i=0;i<=9;i++)
	       {
	         arr[i]=sc.nextInt();
	         if(arr[i]<min)
	           {
	           min=arr[i];
	           }
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	       }
	       System.out.println("Maximum element is "+max);
	       System.out.println("Minimum element is "+min);
		
	}

}
