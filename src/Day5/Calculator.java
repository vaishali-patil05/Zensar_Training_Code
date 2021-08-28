package Day5;

public class Calculator {
	
	int num1;
	int num2;
	
	Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		}
	int add() {
		return num1+num2;
	}
	float division() {
	return num1/num2;
		
	}
	int multiply() {
		return num1*num2;
		
	}
	static void factorial(int l) {
		int fact=1;
		for(int i=1;i<=l;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact+ " fact is");
		
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator(2, 5);
		obj.add();
		float a=obj.division();
		System.out.println(a);
		int b=obj.multiply();
		System.out.println(b);
		Calculator.factorial(5);
	}

}
