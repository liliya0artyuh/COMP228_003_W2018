package polymorphism;

public class Bird extends Animal {
	private int legs;
	private int wings;
	
	
	
	public Bird(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public Bird() {
		super();
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public void move() {
		System.out.printf("%s is flying.%n", type);
	}
}
