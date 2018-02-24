package polymorphism;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		Animal dog = new Dog("dog");
		((Dog) dog).setLegs(4);
		animals.add(dog);

		animals.add(new Fish("fish"));
		animals.add(new Bird("bird"));
		MovementService.makeItMove(animals);

	}

}
