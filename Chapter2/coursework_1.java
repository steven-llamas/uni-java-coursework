/*
Program: 1. Scanner class to read a string from user
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    String msg;
	    Scanner s = new Scanner(System.in);
		System.out.println("Please enter a line of text: ");
		
		msg = s.nextLine();
		System.out.println("You entered: " + msg);
	}
}
