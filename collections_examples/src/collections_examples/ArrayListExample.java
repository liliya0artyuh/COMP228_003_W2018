package collections_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(6));
		numbers.add(new Integer(5));
		numbers.add(new Integer(2));
		System.out.println("numbers: " + numbers);
		Collections.sort(numbers);
		System.out.println("numbers: " + numbers);
		
		List<House> houses = new ArrayList<House>();
		houses.add(new House(200.00, "200"));
		houses.add(new House(400.00, "400"));
		houses.add(new House(100.00, "100"));
		//Collections.sort(houses);
		System.out.println("houses: " + houses);


		
		List<HouseComparable> houseSet = new ArrayList<HouseComparable>();
		houseSet.add(new HouseComparable(200.00, "200"));
		houseSet.add(new HouseComparable(400.00, "400"));
		houseSet.add(new HouseComparable(100.00, "100"));
		houseSet.add(new HouseComparable(500.00, "500"));
		houseSet.add(new HouseComparable(900.00, "900"));
		houseSet.add(new HouseComparable(50.00, "50"));
		Collections.sort(houseSet);
		System.out.println("before loop: " + houseSet);

		Iterator<HouseComparable> iterator = houseSet.iterator();
		while (iterator.hasNext()) {
			HouseComparable h = iterator.next();
			System.out.println(h.toString());
			if (h.getPrice() == 500) {
				iterator.remove();
			}
		}
		System.out.println("after loop: " + houseSet);
	}
}
