package PracticalAss2;
import java.util.Scanner;

public class SumOfAllEvenNum {

	public static void main(String[] args) {
    int n, sum = 0;
        
        System.out.println("Enter a number");
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
       
        
        for(int i = 2; i <= n; i++) {
            
            /*If number is divisible by 2, 
             *then it's a even number
             */       
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println(sum);

	}

}
