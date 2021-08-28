package Day6;
import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Movie m1=new Movie();
	   System.out.println("Enter Movie_name, movie_id : ");
	   String name=sc.next();
	   int id=sc.nextInt();
	   m1.setMovie_id(id);
	   m1.setMovie_name(name);
	   
	   System.out.println("Enter Actor_name,actor id, gender :");
	   String nm=sc.next();
	   int a_id=sc.nextInt();
	   String gender=sc.next();
	   
	   Actor a1=new Actor(id,nm,gender);
	   
	   System.out.println(m1.getActor());
	   System.out.println(m1.getMovie_id());
	   System.out.println(m1.getMovie_name());
	   System.out.println(a1.getActor_id());
	   System.out.println(a1.getGender());
	   System.out.println(a1.getActor_name());
	  
	   
	
	

	}

}
