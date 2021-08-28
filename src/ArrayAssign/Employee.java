package ArrayAssign;

import java.util.Scanner;

import Array.Student;

public class Employee {
private int id;
private String name;
private int salary;

public Employee(int id, String name,  int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	Employee e1=new Employee();
	Employee[] arr=new Employee[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id,name,salary  :");
	int id=sc.nextInt();
	String nm=sc.next();
	int salary=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		arr[i]=new Employee(id,nm,salary);
	}
	System.out.println(id);
	System.out.println(nm);
	System.out.println(salary);
	
	
	
}
}
