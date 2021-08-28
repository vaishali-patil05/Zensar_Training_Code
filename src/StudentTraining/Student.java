package StudentTraining;

public class Student {
	private int stud_id;
	private String name;
	private long mobile;
	private int pass_year;
	private CompanyTraining Company_name;
	

	public Student() {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.mobile = mobile;
		this.pass_year = pass_year;
		this.Company_name = Company_name;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getPass_year() {
		return pass_year;
	}

	public void setPass_year(int pass_year) {
		this.pass_year = pass_year;
	}

	public CompanyTraining getCompany_name() {
		return Company_name;
	}

	public void setCompany_name(CompanyTraining company_name) {
		Company_name = company_name;
	}

	
	
	}

	