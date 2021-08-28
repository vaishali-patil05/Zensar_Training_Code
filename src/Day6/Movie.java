package Day6;

public class Movie {
	private int movie_id;
	private String movie_name;
	private String Actor;

	public Movie(int movie_id, String movie_name, String actor) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		Actor = actor;
	}

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getActor() {
		return Actor;
	}

	public void setActor(String actor) {
		Actor = actor;
	}
	

}
