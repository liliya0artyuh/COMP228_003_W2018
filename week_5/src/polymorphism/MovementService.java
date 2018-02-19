package polymorphism;

import java.util.List;

public class MovementService {
	public static void makeItMove(List<Animal> animals) {
		for (Animal a : animals) {
			a.move();
			if (a instanceof Fish) {
				System.out.println("----------------");
				System.out.println(a.getClass());
				System.out.println("----------------");
				System.out.println("This is a fish. Will execute special logic for Fish");
				System.out.println("Using casting. Fins = " + ((Fish) a).getFins());
				System.out.println("----------------");
				System.out.println(a.getClass().getName());
				System.out.println("----------------");
			}
		}
	}
}
