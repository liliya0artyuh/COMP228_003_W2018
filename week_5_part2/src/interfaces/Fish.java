package interfaces;

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

	@Override
	public void move() {
		System.out.printf("%s is swimming.%n", type);
	}

	@Override
	public String toString() {
		return "Fish [fins=" + fins + ", type=" + type + "]";
	}

}
