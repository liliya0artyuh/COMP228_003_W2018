package ifstatement;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Enter num1 as integer: ");
		num1=input.nextInt();
		
		System.out.print("Enter num2 as integer: ");
		num2=input.nextInt();
		
		if(num1>num2)
		{
			System.out.println("num1 is greater than num2");
		}
		
		else if(num1<num2)
		{
			System.out.println("num1 is lesser than num2");
		}
		
		else
		{
			System.out.println("Both numbers are equal");
		}
		
		
		
	}

}
