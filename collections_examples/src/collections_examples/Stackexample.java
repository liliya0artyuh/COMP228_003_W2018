package collections_examples;

import java.util.Stack;

public class Stackexample {
	public static void main(String[] args) {
		Stack<House> houses = new Stack<>();
		houses.push(new House(200.00, "200"));
		houses.push(new House(400.00, "400"));
		houses.push(new House(100.00, "100"));
		
		System.out.println(houses.peek());
		
		System.out.println("before popping: " + houses.size());
		System.out.println(houses.pop());
		System.out.println("after popping: " + houses.size());

	}
}
