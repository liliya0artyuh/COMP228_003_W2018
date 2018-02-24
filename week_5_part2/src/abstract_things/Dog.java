package abstract_things;

public class Dog extends Animal {
	private int legs;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name) {
		super("Dog");
		this.name= name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public void move() {
		System.out.printf("%s is running.%n", type);
	}
	public String toString() {
		return "i am a dog and my name is: "+ getName().toString();
	}
}
