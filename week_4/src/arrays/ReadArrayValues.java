package arrays;

public class ReadArrayValues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[9]; // declare first and say what size it is
		// (size =10)
		array1[0] = 11;// now set vales at 0 position
		array1[1] = 24;// set value to 24 at position 1
		array1[2] = 33;// set value to 33 at position 2
		array1[3] = 45;// etc...
		array1[4] = 57;
		
		System.out.printf("%5d%8d%n", 0, array1[0]);
		System.out.printf("%5d%8d%n", 1, array1[1]);
		System.out.printf("%5d%8d%n", 2, array1[2]);
		
		System.out.println("======================= ");
		
		// if you do not set the rest of the values (u set length of array to 10
		// but provided only first 5 values)
		// the rest of the values will be set to 0 by default
		int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		// read values from array1
		for (int index = 0; index < array1.length; index++) {
			System.out.printf("%5d%8d%n", index, array1[index]);
			}
		System.out.println("");
		// read values from array2
		for (int counter = 0; counter < array2.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array2[counter]);
		}
		
		for (int value : array2) {
			System.out.printf("%8d%n", value);
		}

	}
}
