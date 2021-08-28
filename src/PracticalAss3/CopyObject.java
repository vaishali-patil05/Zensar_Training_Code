package PracticalAss3;

public class CopyObject {
	int age ;
	String name;
	String city;
	
	public CopyObject(int i, String string, String string2) {
		
	}
	public CopyObject(CopyObject c1) {
		
	}
	public void display() {
		System.out.println("age is" +age);
		System.out.println("name is" +name);
	}
	public static void main(String[] args) {
		CopyObject c1=new CopyObject(23,"vaishali","pune");
		CopyObject c2=new CopyObject(c1);
		c1.display();
		c2.display();
		
		
	}

}
