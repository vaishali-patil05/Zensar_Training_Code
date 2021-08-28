package Array;

public class Movie {
	private int mid;
	private String movie_name;
	private String[] actorList;
	
	
	public Movie(int mid, String movie_name, String[] actorList) {
		super();
		this.mid = mid;
		this.movie_name = movie_name;
		this.actorList = actorList;
	}


	public Movie() {
		// TODO Auto-generated constructor stub
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMovie_name() {
		return movie_name;
	}


	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}


	public String[] getActorList() {
		return actorList;
	}


	public void setActorList(String[] actorList) {
		this.actorList = actorList;
	}


	
}
