package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Bird b = new Bird("bird");
		Dog d = new Dog("dog");
		Fish f = new Fish("fish");
		f.setFins(4);
		Frog frog = new Frog("frog");
		// Animal a = new Animal("animal");

		List<Animal> animals = new ArrayList<Animal>();
		// animals.add(a);
		animals.add(frog);
		animals.add(b);
		animals.add(d);
		animals.add(f);

		MovementService.makeItMove(animals);

		Animal.someStaticMethod();

		Plane plane = new Plane();
		plane.fly();

		List<Flyable> flying_things = new ArrayList<Flyable>();
		flying_things.add(b);
		flying_things.add(plane);

		displayFlyableThings(flying_things);
		// System.out.println(f.toString());
	}

	public static void displayFlyableThings(List<Flyable> flying_things) {
		for (Flyable f : flying_things) {
			f.fly();
		}
	}
}
