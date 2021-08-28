package ArrayAssign;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary search data should be in sorted order
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter "+size+ " Element");
        
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        	
        	}
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
    	System.out.println(Arrays.toString(a));
    	
    	System.out.println("Enter Search element :");
    	int search=sc.nextInt();
    	
    	int start=0,end=a.length-1;
    	
    	int found=0;
    	while(start<=end) {
    		int mid=(start+end)/2;
    		
    		if(a[mid]==search) {
    			System.out.println("Element present at position :" +mid);
    			found=1;
    			break;
    		}
    		else if(search>a[mid]) {
    			start=mid+1;
    			
    			
    		}
    		else {
    			end=end-1;
    		}
    	}
        if(found==0) {
        	System.out.println("Element not found");
        }
        
	}

}
