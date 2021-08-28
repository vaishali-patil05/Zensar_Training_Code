package StudentTraining;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Trainer t1 = new Trainer();
		t1.setT_id(103);
		t1.setMobile(41684123);
		t1.setTrainer_name("deepa");

		CompanyTraining c1 = new CompanyTraining();
		c1.setCid(145);
		c1.setCom_name("zensar");
		c1.setTrainer_name(t1);

		Student s1 = new Student();
		s1.setStud_id(123);
		s1.setName("vaishali");
		s1.setMobile(78954621);
		s1.setPass_year(2020);
		s1.setCompany_name(c1);
		

		System.out.println(t1.getT_id());
		System.out.println(t1.getTrainer_name());
		System.out.println(t1.getMobile());

		System.out.println(c1.getCid());
		System.out.println(c1.getCom_name());

		System.out.println(s1.getStud_id());
		System.out.println(s1.getName());
		System.out.println(s1.getPass_year());
		System.out.println(s1.getMobile());
		System.out.println(s1.getPass_year());

	}

}
