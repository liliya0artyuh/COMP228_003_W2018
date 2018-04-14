package a_2_unchecked_exceptions;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		try {
			ArrayList<String> textList = new ArrayList<String>();
			textList.add("hjhj");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
