package containmenmentAssignment;

public class Pen {
	private int capLength;
	private String Brand;
	private Refill r;

	public Pen(int capLength, String brand, int i) {
		super();
		this.capLength = capLength;
		Brand = brand;
		this.r = r;
	}

	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public Refill getR() {
		return r;
	}

	public void setR(Refill r) {
		this.r = r;
	}

}
