package a_5_rethrow_exception;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		try {
			ArrayList<String> textList = null;
			//System.out.println(textList.get(0));

			textList = new ArrayList<String>();
			textList.add("hjhj");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch(NullPointerException e2) {
			System.err.println(e2 + " I guess I did not initialize my variable.");
		} catch(IndexOutOfBoundsException e1) {
			//System.out.println(textList.get(0));
			System.err.println(e1 + " ddd tttt iiii hhh");
			throw e1;
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This will be executed if there is exception or not.");
		}
		
		System.out.println("This line is after all catch blocks.");
		//System.out.println(textList.get(0));

	}

}
