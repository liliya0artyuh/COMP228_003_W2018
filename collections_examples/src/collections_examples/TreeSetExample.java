package collections_examples;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		displayHouseWithoutComparitor();
		displayHouseWitComparitor();

	}

	private static void displayHouseWitComparitor() {
		TreeSet<HouseComparable> houseSet = new TreeSet<HouseComparable>();
		houseSet.add(new HouseComparable(200.00, "200"));
		houseSet.add(new HouseComparable(400.00, "400"));
		houseSet.add(new HouseComparable(100.00, "100"));
		houseSet.add(new HouseComparable(500.00, "500"));
		houseSet.add(new HouseComparable(900.00, "900"));
		houseSet.add(new HouseComparable(50.00, "50"));
		System.out.println(houseSet);
	}

	private static void displayHouseWithoutComparitor() {
		try {
			TreeSet<House> houseSet = new TreeSet<House>();
			houseSet.add(new House(200.00, "200"));
			houseSet.add(new House(400.00, "400"));
			houseSet.add(new House(100.00, "100"));
			houseSet.add(new House(500.00, "500"));
			houseSet.add(new House(900.00, "900"));
			houseSet.add(new House(50.00, "50"));
			System.out.println(houseSet);
		} catch (ClassCastException e) {
			System.err.println(e);
		}
	}

}
