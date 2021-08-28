package PracticalAss4;

public class ParameterizedCon {
	long AccountNumber;
	String customerName;

	public ParameterizedCon(long accountNumber, String customerName) {
		super();
		AccountNumber = accountNumber;
		this.customerName = customerName;

		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {
		ParameterizedCon obj = new ParameterizedCon(569856, "vaishali");
		System.out.println(obj.AccountNumber);
		System.out.println(obj.customerName);

	}

}








