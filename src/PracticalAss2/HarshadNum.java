package PracticalAss2;

public class HarshadNum {

	public static void main(String[] args) {
	    int num = 156;  
        int rem = 0, sum = 0, n;  
          
        /*sum of its digit will be 1 + 5 + 6 = 12. Since 156 is divisible by 12. So, 156 is a Harshad number.*/
        n = num;  
          
        //Calculates sum of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + rem;  
            num = num/10;  
        }  
          
        //Checks whether number is divisible by sum of digits  
        if(n%sum == 0)  
            System.out.println(n + " is a harshad number");  
        else  
            System.out.println(n + " is not a harshad number");  

	}

}
