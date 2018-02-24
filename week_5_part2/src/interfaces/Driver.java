package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		Animal dog = new Dog("dog");
		((Dog) dog).setLegs(4);
		animals.add(dog);

		animals.add(new Fish("fish"));
		animals.add(new Bird("bird"));
		MovementService.makeItMove(animals);

		Bird b = new Bird("bird");

		Plane p = new Plane();
		
		b.fly();
		p.fly();

		ArrayList<Flyable> flyableThings = new ArrayList<Flyable>();

		flyableThings.add(b);
		flyableThings.add(p);
		displayFlyableThings(flyableThings);
		
	}
	
	public static void displayFlyableThings(List<Flyable> flying_things) {
		for (Flyable f : flying_things) {
			f.fly();
		}
	}


}
