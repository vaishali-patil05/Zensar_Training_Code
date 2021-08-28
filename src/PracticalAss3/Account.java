package PracticalAss3;

import java.util.Scanner;

public class Account {
	String Acc_name;
	long Account_num;
	int Balance;

	Account(String Acc_name, long Account_num, int Balance) {
		this.Acc_name = Acc_name;
		this.Account_num = Account_num;
		this.Balance = Balance;

	}

	public void withdraw() {
		System.out.println("Enter the amount :");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();

		if (amount > Balance)
			System.out.println("Insufficient Balance");
		else

		{
			Balance = Balance - amount;
			System.out.println("Withdraw Successfully");
		}
	}

	public void deposit(int amount) {

		Balance = Balance + amount;
		System.out.println("Successfully");

	}

	public static void main(String args[]) {
		Account a = new Account("vaishali", 12354455, 4000);

		a.withdraw();
		a.deposit(5000);

	}

}
