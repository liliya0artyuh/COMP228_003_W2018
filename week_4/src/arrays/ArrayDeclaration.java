package arrays;

public class ArrayDeclaration {
	public static void main(String[] args) {
		// two ways to declare an array and set array values
		int[] array1 = new int[9]; // declare first and say what size it is (size =10)
		array1[0] = 11;// now set vales at 0 position
		array1[1] = 24;// set value to 24 at position 1
		array1[2] = 33;// set value to 33 at position 2
		array1[3] = 45;// etc...
		array1[4] = 57;
		// if you do not set the rest of the values (u set length of array to 10 but
		// provided only first 5 values)
		// the rest of the values will be set to 0 by default - see next example
		// ReadArrayValues
		int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		// property length of array returns you the value equal to array size/length
		System.out.println(array1.length);
		System.out.println(array2.length);
		
	}
}
