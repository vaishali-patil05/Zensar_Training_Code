package Array;

import java.util.Arrays;

public class CopyTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,};
		int[] b= {2,2,3,6,7};
		int max=a.length>b.length?a.length:b.length;
		int[] c=new int[a.length];
		
		for(int i=0;i<=max;i++) {
			
			if(i<a.length && i<b.length) {
				c[i]=a[i]+b[i];
			}
			else if(i<a.length) {
				c[i]=a[i];
			}
			else if(i<b.length){
				c[i]=b[i];
				
			}
		}
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
		

	}

}
