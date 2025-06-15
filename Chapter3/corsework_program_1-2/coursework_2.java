/*
Program: 2. The super Reference (Words2.java or Main.java)
Other files needed for this program: two files, Book2.java, Dictionary2.java
*/

public class Main
{
	public static void main(String[ ] args) 
	{
	    Dictionary2 webster = new Dictionary2 (1500, 52500);
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: " + webster.getDefinitions());
        System.out.println("Definitions per page: " + webster.computeRatio());
	}
}