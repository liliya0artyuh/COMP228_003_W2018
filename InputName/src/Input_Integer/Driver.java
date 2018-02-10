/**
 * 
 */
package Input_Integer;

/**
 * @author lartyukh
 *
 */
import java.util.Scanner;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2, sum;
		
		System.out.print("Enter first integer: ");
		
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("Sum is %d%n", sum);
		 
		//input.close();
		
		

		
		

	}

}
