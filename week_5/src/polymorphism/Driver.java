package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Bird b = new Bird("bird");
		Dog d = new Dog("dog");
		Fish f = new Fish("fish");
		f.setFins(4);

		List<Animal> animals = new ArrayList<Animal>();
		animals.add(b);
		animals.add(d);
		animals.add(f);
		
		MovementService.makeItMove(animals);
		

		//System.out.println(f.toString());
	}
}
