package abstract_things;

public class Frog extends Animal {

	
	
	public Frog(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.printf("%s is jumping.%n", type);
	}

	
}
