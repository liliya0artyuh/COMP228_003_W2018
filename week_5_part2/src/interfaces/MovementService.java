package interfaces;

import java.util.ArrayList;

public class MovementService {

	public static void makeItMove(ArrayList<Animal> animals) {
		for (Animal a : animals) {
			a.move();
			if(a instanceof Dog) {
				System.out.println("this is Dog!" + ((Dog)a).getLegs());
			}
		}
	}
}
