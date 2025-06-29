/*

Program: 4. Math class (determine quadratic equation roots)
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[ ] args) 
	{
	    int a, b, c; // ax^2 + bx + c
        double discriminant, root1, root2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the coefficient of x squared (a): ");
        a = scan.nextInt();
        System.out.print("Enter the coefficient of x (b): ");
        b = scan.nextInt();
        System.out.print("Enter the constant (c): ");
        c = scan.nextInt();
		
		discriminant = Math.pow(b, 2) - (4 * a * c);
        root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

		System.out.println("Root #1: " + root1);
		System.out.println("Root #2: " + root2);
	}
}
