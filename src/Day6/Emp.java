package Day6;

public class Emp {
	private int emp_id;
	private String name;
	private int salary;
	private Department dept;

	public Emp(int emp_id, String name, int salary, Department dept) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
