package PracticalAss3;

public class Student {

	int id;
	String name;
	long mob;
	
	public static void main(String args[]) {

		Student s1 = new Student();
		s1.id = 101;
		s1.name = "vaishali";
		s1.mob = 85456565;
		Student s2 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.mob);

	}
}
