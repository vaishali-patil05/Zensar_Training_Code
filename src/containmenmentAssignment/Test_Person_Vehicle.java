package containmenmentAssignment;

public class Test_Person_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.setName("bike");
		v.setVid(4);
		System.out.println(v.getName());

		Person p = new Person();
		p.setId(1);
		p.setName("vaishali");
		p.setVid(new Vehicle());
		

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getVid());

	}

}
