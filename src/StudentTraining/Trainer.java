package StudentTraining;

public class Trainer {
	private int t_id;
	private String trainer_name;
	private long mobile;

	public Trainer(int t_id, String trainer_name, long mobile) {
		super();
		this.t_id = t_id;
		this.trainer_name = trainer_name;
		this.mobile = mobile;
	}

	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


}
