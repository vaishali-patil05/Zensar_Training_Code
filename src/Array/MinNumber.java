package Array;
import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("enter " +array.length+" element");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i])
				min=array[i];
		}
		System.out.println("Minimum " +min);
			
		
	}

}
