/*
Demonstrates indirect access to inherited private members
Other files needed for this program: two files, FoodItem.java, Pizza.java
*/

public class Main
{
	public static void main(String[ ] args) 
	{
	   // Instantiates a Pizza object and prints its calories per serving.
	    Pizza special = new Pizza(275);
        System.out.println("Calories per serving: " + special.caloriesPerServing());
	}
}