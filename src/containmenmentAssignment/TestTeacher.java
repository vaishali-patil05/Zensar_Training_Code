package containmenmentAssignment;

public class TestTeacher {

	public static void main(String[] args) {
		HourlyBased obj1=new HourlyBased(123,"vaishali",654565456);
		SalaryBased obj2=new SalaryBased(145,"vaishu",8465451);
		obj1.salary();
		obj2.salary();

	}

}
