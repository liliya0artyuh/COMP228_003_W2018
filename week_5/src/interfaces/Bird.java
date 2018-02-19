package interfaces;

public class Bird extends Animal implements Flyable {
	
	
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
		//extracting common logic to one method. 
		moveBird();
	}
	private void moveBird() {
		//extracting common logic to one method. 
		System.out.printf("%s is flying.%n", type);	
	}
	@Override
	public void fly() {
		//extracting common logic to one method. 
		//System.out.printf("%s is flying.%n", type);
		moveBird();
	}
}
