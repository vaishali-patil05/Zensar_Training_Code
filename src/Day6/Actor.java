package Day6;

public class Actor {
 private int actor_id; 
 private String actor_name;
 private String gender;
public Actor(int actor_id, String actor_name, String gender) {
	super();
	this.actor_id = actor_id;
	this.actor_name = actor_name;
	this.gender = gender;
}
public int getActor_id() {
	return actor_id;
}
public void setActor_id(int actor_id) {
	this.actor_id = actor_id;
}
public String getActor_name() {
	return actor_name;
}
public void setActor_name(String actor_name) {
	this.actor_name = actor_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
 
 
 
}
