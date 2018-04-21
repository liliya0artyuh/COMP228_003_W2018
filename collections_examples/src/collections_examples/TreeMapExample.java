package collections_examples;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Short, House> houseMap = new TreeMap<Short, House>();
		houseMap.put(Short.valueOf("200"), new House(200.00, "200"));
		houseMap.put(Short.valueOf("400"), new House(400.00, "400"));
		houseMap.put(Short.valueOf("100"), new House(100.00, "100"));
		houseMap.put(Short.valueOf("500"), new House(500.00, "500"));
		houseMap.put(Short.valueOf("900"), new House(900.00, "900"));
		houseMap.put(Short.valueOf("50"), new House(50.00, "50"));
        System.out.println(houseMap);
        
        System.out.println(houseMap.get(Short.valueOf("200")));
	}

}
