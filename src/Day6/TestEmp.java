package Day6;
import java.util.Scanner;
public class TestEmp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Emp e1=new Emp();
		System.out.println("Enter emp-id,name :");
		int id=sc.nextInt();
		String name=sc.next();
		e1.setEmp_id(id);
		e1.setName(name);
		
		System.out.println("Enter dep_name,dep_id ");
	    String dep_name=sc.next();
	    int dep_id=sc.nextInt();
	    
	    
	    
	    Department d1=new Department(dep_name,dep_id);
	    
	   
	    System.out.println(e1.getEmp_id());
	    System.out.println(e1.getName());
	    System.out.println(d1.getDep_id());
	    System.out.println(d1.getDep_name());
	    

	}

}
