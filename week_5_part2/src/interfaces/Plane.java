package interfaces;

public class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.printf("Plane is flying using engine.%n");

	}

}
