package interfaces;

import java.util.List;

public class MovementService {
	
	//make method static so we can call it without instantiating an object of this class
	public static void makeItMove(List<Animal> animals) {
		for (Animal a : animals) {
			a.move();
			if (a instanceof Fish) {//check if current animal is a Fish
				System.out.println("----------------");
				System.out.println(a.getClass());
				System.out.println("----------------");
				System.out.println("This is a fish. Will execute special logic for Fish");
				System.out.println("Using casting. Fins = " + ((Fish)a).getFins());
				System.out.println("----------------");
				System.out.println(a.getClass().getName());
				System.out.println("----------------");
			}
		}
	}
}
