package ifstatement;

public class Driver_strings {

	public static void main(String[] args) {

		String john = "sally";
		String sally = "Sally";
		
		if (john.equalsIgnoreCase(sally)) {
			System.out.println("names equal ");
		} else {
			System.out.println("not equals");
		}
	}

}
