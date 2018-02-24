package polymorphism.phone;

public class Phone {
	protected long number;
	
	public Phone(long number) {
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}
	
	public void call(Phone phone) {
		System.out.printf("Making call from number %d to number %d of type %s%n",
				number, phone.number, getClass());
	}
}
