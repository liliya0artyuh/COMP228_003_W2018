/**
 * 
 */
package division;

import java.util.Scanner;

/**
 * @author lartyukh
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double num1, num2, ans;

		System.out.print("Enter first integer: ");

		num1 = input.nextDouble();

		System.out.print("Enter second integer: ");

		num2 = input.nextDouble();
		
		ans = num1 / num2;
		
		System.out.printf("%.2f", ans);

	}

}
