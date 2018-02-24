package polymorphism.phone;

public class CellPhone extends Phone {
	private boolean wifi;

	public CellPhone(long number) {
		super(number);
		wifi = true;
	}

	public boolean isWifi() {
		return wifi;
	}
}
