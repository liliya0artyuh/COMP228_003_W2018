package a_3_multiple_catch;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Driver {

	public static void main(String[] args) {
		//testMultipleCatchBlocks();
		
		testMulti_CatchBlocks();

	}

	private static void testMultipleCatchBlocks() {
		try {
			ArrayList<String> textList = null;
			System.out.println(textList.get(0));

			textList = new ArrayList<String>();
			textList.add("hjhj");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch(NullPointerException e2) {
			System.err.println(e2 + " I guess I did not initialize my variable.");
		} catch(IndexOutOfBoundsException e1) {
			//System.out.println(textList.get(0));
			System.err.println(e1 + " processign index_out_of_bound in a specific way.");			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("This line is after all catch blocks.");
		//System.out.println(textList.get(0));
	}
	
	private static void testMulti_CatchBlocks() {
		try {
			ArrayList<String> textList = null;
			//System.out.println(textList.get(0));

			textList = new ArrayList<String>();
			textList.add("hjhj");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch(NullPointerException | IndexOutOfBoundsException | InputMismatchException e) {
			System.err.println(e + " Processign all three exceptions in the same way.");
		}
		
		System.out.println("This line is after all catch blocks.");
		//System.out.println(textList.get(0));
	}
}
