package abstract_things;

public abstract class Animal {
	protected int eyes;
	public String color;
	protected String type;
	public static String myStaticVar = "testing static with abstract class";


	public Animal(String type) {
		super();
		this.type = type;
	}
	
	



	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void eat() {
		System.out.printf("%s is eating.%n", type);
	}
	
	public void sleep() {
		System.out.printf("%s is sleeping.%n", type);
	}
	
	public abstract void move();
	
	public String toString() {
		return " i am in animal class";
	}
}
