package PracticalAss4;

public class Account {

	long AccountNumber=7854554;
	String customerName="vaishali";
	
	public Account() {
		long acc = 558529855;
		String accName = "vaishu";
		this.AccountNumber=acc;
		this.customerName=accName;
		
		System.out.println("I am in default Constructor");
		
	
	}
	

	public static void main(String[] args) {
		Account obj=new Account();
		System.out.println(obj.AccountNumber);
		System.out.println(obj.customerName);
		
	}
}
