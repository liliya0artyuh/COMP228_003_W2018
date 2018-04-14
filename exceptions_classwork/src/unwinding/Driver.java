package unwinding;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		createArrayListMethod();
	}

	
	
	private static void createArrayListMethod() {
		createArrayList();
	}
	private static void createArrayList() {
		ArrayList<String> textList = null;
		System.out.println(textList.get(0));
		textList = new ArrayList<String>();
		textList.add("hjhj");
		System.out.println(textList.get(0));
		// System.out.println(textList.get(1));
	}
}
