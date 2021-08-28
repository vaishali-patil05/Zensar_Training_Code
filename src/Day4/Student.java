package Day4;

import java.util.Scanner;

public class Student {

	String Name;
	String Qualification;
	String Address;
	long Mobile;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		Name = sc.next();
		System.out.println("Enter Qualification : ");
		Qualification = sc.next();
		System.out.println("Enter Address : ");
		Address = sc.next();
		System.out.println("Enter Mobile Number : ");
		Mobile = sc.nextLong();

	}

	void display() {
		System.out.println("Your Name : " + Name);
		System.out.println("Your Qualification : " + Qualification);
		System.out.println("Your Address : " + Address);
		System.out.println("Your Mobile Number : " + Mobile);

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.accept();
		s1.display();
		System.out.println("");

		Student s2 = new Student();
		s2.accept();
		s2.display();
	}

}
