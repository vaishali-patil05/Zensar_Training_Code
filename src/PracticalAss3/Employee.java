package PracticalAss3;

import java.security.PublicKey;

public class Employee {
	private int emp_id;
	private String Emp_name;
	private int salary;

	public Employee(int emp_id, String Emp_name, int salary) {
		this.emp_id = emp_id;
		this.Emp_name = Emp_name;
		this.salary = salary;

	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name() {
		this.Emp_name = Emp_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
