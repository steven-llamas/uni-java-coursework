/*
Module: 1. Introduction
Program: 1. My first java program
*/

public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello class, CS 460 / IS 393");
	}
}


/*
Module: 1. Introduction
Program: 2. Java methods
*/

public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("* public means main ( ) can be called from anywhere");
		System.out.println("* static means main ( ) doesn’t belong to a specific object");
		System.out.println("* void means main ( ) return no value");
		System.out.println("* main is the name of function");
		System.out.println("* String means the data type");
		System.out.println("* args is argument passed to function");
		System.out.println("* class identifies Main as a class");
		System.out.println("* Main is the name of class");
	}
}

/*
Module: 1. Introduction
Program: 3. Java variables
*/

public class Main
{
	public static void main(String[] args) 
	{
		int x = 10;
		double num1 = 4.56;
		char letter = 'A';
		
		System.out.println("Value of integer variable x is " + x);
		System.out.println("Value of double variable num1 is " + num1);
		System.out.println("Value of char variable letter is " + letter);
	}
}




/*
Module: 1. Introduction
Program: 4. Java data types (primitive)
*/

public class Main
{
	public static void main(String[] args) 
	{
		byte b1 = 7;
		short s1 = 655;
		float num1 = 3.14f;
		boolean a = true;
		String str1 = "MonWedFri 9:00-9:50";
		
		System.out.println("Byte variable b1 is " + b1);
		System.out.println("Short variable s1 is " + s1);
		System.out.println("Float variable num1 is " + num1);
		System.out.println("Boolean variable a is " + a);
		System.out.println("String variable str1 is " + str1);
	}
}