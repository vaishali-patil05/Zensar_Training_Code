package ArrayAssign;

public class OddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		int b[]={5,6,5,8,3,2};  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(b[i]%2==0){  
		System.out.println(b[i]);  
		}  
		}  

	}

}
