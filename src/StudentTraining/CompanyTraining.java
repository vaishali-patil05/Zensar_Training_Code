package StudentTraining;

public class CompanyTraining {
	private int cid;
	private String Com_name;
	private Trainer trainer_name;

	public CompanyTraining(int cid, String com_name, Trainer training_name) {
		super();
		this.cid = cid;
		Com_name = com_name;
		this.trainer_name = trainer_name;
	}

	public CompanyTraining(String com_name2, int com_id) {
		// TODO Auto-generated constructor stub
	}

	public CompanyTraining() {
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCom_name() {
		return Com_name;
	}

	public void setCom_name(String com_name) {
		Com_name = com_name;
	}

	public Trainer getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(Trainer trainer_name) {
		this.trainer_name = trainer_name;
	}

	

}
