package finally_block;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		
		try {
			ArrayList<String> textList = null;
			System.out.println(textList.get(0));
			textList = new ArrayList<String>();
			textList.add("hjhj");
			System.out.println(textList.get(0));
			//System.out.println(textList.get(1));
		} finally {
			System.out.println("This will be executed if there is exception or not.");
		}
	}
}
