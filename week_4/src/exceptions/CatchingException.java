package exceptions;

public class CatchingException {
	public static void main(String[] args) {
		int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

		try {
			// read values from array2
			for (int counter = 0; counter <= array2.length; counter++) {// = sign will cause index out of bound
																		// exception
				System.out.printf("%5d%8d%n", counter, array2[counter]);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Sorry, there was a problem with the program." + " The application will terminate.");
			System.exit(1);
		}
		System.out.print("jjj");
	}
}