package PracticalAss3;

public class ArithmaticOperation {

	int a;
	int b;
	
	
	public ArithmaticOperation() {
		this.a=a;
		this.b=b;
		
	}
	public int add(int a,int b) {
		return a+b;
		
	}
	public float multiply(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
	public int substraction(int a,int b) {
		return a-b;
		
	}
	public static void main(String[] args) {
		 ArithmaticOperation obj=new  ArithmaticOperation();
		 System.out.println("Addition is : " +obj.add(10, 20));
		 System.out.println("Multiplication is : " +obj.multiply(10, 20));
		 System.out.println("Division is : " +obj.division(30, 20));
		 System.out.println("Substraction is : " +obj.substraction(10, 20));
	}
}

