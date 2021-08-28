package Day2HW;

import java.util.Scanner;

import com.sun.net.httpserver.Filter.Chain;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
	      Scanner sc = new Scanner(System.in);
	      double no1 = sc.nextDouble();
	      double no2 = sc.nextDouble();
	      
	      System.out.println("Enter Operand  (+,-,*,/)");
	      char op =sc.next().charAt(0);
	      
	      double o = 0;
	      
	        switch (op) {
	  
	        // case to add two numbers
	        case '+':
	  
	            o = no1 + no2;
	  
	            break;
	  
	        
	        case '-':
	  
	            o = no1 - no2;
	  
	            break;
	  
	        case '*':
	  
	            o = no1 * no2;
	  
	            break;
	  
	        
	        case '/':
	  
	            o = no1 / no2;
	  
	            break;
	  
	        default:
	  
	            System.out.println("You enter wrong input");
	  
	            break;
	        }
	  
	        System.out.println("The final result:");
	  
	        
	        System.out.println(no1 + " " + op + " " + no2
	                           + " = " + o);
	      
	}

}
