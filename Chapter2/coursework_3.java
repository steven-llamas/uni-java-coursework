/*
Program: 3. Random class
*/

import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[ ] args) 
	{
	    int num1;
	    float num2;
		Random generator = new Random ( );
		
		// nextInt ( ) returns a random number ranges over all possible int values (positive & negative) 
		num1 = generator.nextInt();
		System.out.println("A random integer: " + num1);
		
		// nextInt (int num) returns a random number in range 0 to num-1
		num1 = generator.nextInt(10);
		System.out.println("Random integer between 0 to 9: " + num1);
		
		num1 = generator.nextInt(10) + 1;
		System.out.println("Random integer between 1 to 10: " + num1);
		
		// nextFloat ( ) returns a random number between 0.0 and 1.0
		num2 = generator.nextFloat();
		System.out.println("A random float (between 0 - 1): " + num2);
	}
}
