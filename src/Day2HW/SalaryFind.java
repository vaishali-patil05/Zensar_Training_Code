package Day2HW;
import java.util.Scanner;

public class SalaryFind {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Basic Salary : ");
		double sal= sc.nextDouble();
		
		if(sal<=10000) {
			double HRA = sal*0.2;
			double DA = sal*0.8;
			System.out.println("Gross Salary :" +(sal+HRA+DA));
			
			
		}
		else if(sal<=20000) {
			double HRA = sal*0.25;
			double DA = sal*0.9;
			System.out.println("Gross Salary :" +(sal+HRA+DA));
		}
		if(sal>=20000) {
			double HRA = sal*0.3;
			double DA = sal*0.95;
			System.out.println("Gross Salary :" +(sal+HRA+DA));
	}
	}
	

}
