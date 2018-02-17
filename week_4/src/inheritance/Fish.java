package inheritance;

public class Fish extends Animal {
	private int fins;
	
	public Fish() {
		super();
	}

	public Fish(String type) {
		super(type);
	}

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	public void move() {
		super.move();
		System.out.printf("%s is swimming.%n", type);
	}
}
