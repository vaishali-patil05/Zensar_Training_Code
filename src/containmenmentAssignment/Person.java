package containmenmentAssignment;

public class Person {
	private int id;
	private String name;
	private Vehicle vid;
	public Person(int id, String name, Vehicle vid) {
		super();
		this.id = id;
		this.name = name;
		this.vid = vid;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVid() {
		return vid;
	}
	public void setVid(Vehicle vid) {
		this.vid = vid;
	}
	
	
	
	

}
