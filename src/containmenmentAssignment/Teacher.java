package containmenmentAssignment;

public abstract class Teacher {
	private int Tid;
	private String Tname;
	private long MobNumber;
	public Teacher(int tid, String tname, long mobNumber) {
		super();
		Tid = tid;
		Tname = tname;
		MobNumber = mobNumber;
	}
	abstract void salary();

}
