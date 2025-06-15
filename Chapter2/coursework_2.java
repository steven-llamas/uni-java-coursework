/*
Program: 2. String class & its methods
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    String msg;
	    Scanner s = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		
		msg = s.nextLine();
		
		System.out.println("\nString you entered: " + msg);
		System.out.println("1. Length of string: " + msg.length()); // string length
		System.out.println("2. Uppercase string: " + msg.toUpperCase()); // change to uppercase
		System.out.println("3. Lowercase string: " + msg.toLowerCase()); // change to lowercase
		System.out.println("4. Replace letter 'e' with 'X': " + msg.replace('e', 'X')); // replace letters
		System.out.println("5. Substring from 3 to 10: " + msg.substring(3, 10)); // substring from 3 to 10
	}
}
