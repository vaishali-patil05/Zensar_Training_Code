package Day6;

public class Department {
	private int dep_id;
	private String dept;

	public Department(int dep_id, String dep_name) {
		super();
		this.dep_id = dep_id;
		this.dept = dep_name;
	}

	public Department(String dep_name, int dep_id2) {
		// TODO Auto-generated constructor stub
	}

	public int getDep_id() {
		return dep_id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dept;
	}

	public void setDep_name(String dep_name) {
		this.dept = dep_name;
	}

}
