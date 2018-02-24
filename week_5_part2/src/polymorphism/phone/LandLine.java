package polymorphism.phone;

public class LandLine extends Phone {
	private String cable;

	public LandLine(long number) {
		super(number);
	}

	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}
}
