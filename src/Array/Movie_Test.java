package Array;

public class Movie_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Movie m=new Movie();
			m.setMid(10);
			m.setMovie_name("Shershah");
			String[] ShehrshahList=new String[5];
			ShehrshahList[0]="Siddharth Malhotra";
			ShehrshahList[0]="Kiara Advani";
			m.setActorList(ShehrshahList);
			
			System.out.println(m.getMid());
			System.out.println(m.getMovie_name());
			
		}
	
	
	}


