/*
Program: 5. Formatting Output (The NumberFormatClass)
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class Main
{
	public static void main(String[ ] args) 
	{
	    final double TAX_RATE = 0.06; // 6% sales tax
        int quantity;
        double subtotal, tax, totalCost, unitPrice;
        Scanner scan = new Scanner(System.in);
        
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();
        System.out.print("Enter the unit price: ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
        
        // Print output with appropriate formatting
        System.out.println("- - - - - - - - - - - - - - - - - - - ");
        System.out.println("Subtotal (qty * unit price): " + fmt1.format(subtotal));
        System.out.println("Sales tax on subtotal: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("- - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total: " + fmt1.format(totalCost));
	}
}