package arrays;

public class PassingArraysToMethods {
	public static void main(String[] args) {
		// Fig. 7.13: PassArray.java
		// Passing arrays and individual array elements to methods.
		// main method creates array and calls modifyArray and modifyElement
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		System.out
				.printf("Effects of passing reference to entire array:%n" + "The values of the original array are:%n");
		// output original array elements
		for (int value : array) {
			System.out.printf(" %d", value);
		}
		modifyArray(array); // pass array reference
		System.out.printf("%n%nThe values of the modified array are:%n");
		// output modified array elements
		for (int value : array) {
			System.out.printf(" %d", value);
		}
		System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: %d%n",
				array[3]);
		modifyElement(array[3]); // attempt to modify array[3]
		System.out.printf("array[3] after modifyElement: %d%n", array[3]);
	}

	public static void modifyArray(int[] array2) {//only reference (address in memory) is passed)
		for (int counter = 0; counter < array2.length; counter++) {
			array2[counter] *= 2;
		}
	}

	// multiply argument by 2
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement: %d%n", element);
	}
}
