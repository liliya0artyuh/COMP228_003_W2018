package method;

public class Driver {

	public static void main(String[] args) {
		String xyz="students";
		sayHello(xyz);
		method1();
		

		// invoke second method
	}
	
	//create second method
	public static void method1() {
		System.out.println("I don't what to say");
		//sayHello();

		}
	
	public static void sayHello(String xyz) {
		System.out.println("Hello "+xyz+"!");
	}


	
}
