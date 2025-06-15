/*
Filename: Pizza.java (file 2 for FoodAnalyzer.java)
Represents a pizza, a food item, used to demonstrate indirect referencing via inheritance.
*/

public class Pizza extends FoodItem
{
	// Sets up a pizza with the specified amount of fat (assumes eight servings).
    public Pizza(int fatGrams)  {  super(fatGrams, 8);  }    
}