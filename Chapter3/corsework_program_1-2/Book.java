/*
Program: 1. Creating Subclasses
Filename: Book.java (file 1 for Words.java)  
*/

public class Book
{
	protected int pages = 1500;
    // Pages mutator.
    public void setPages(int numPages) {    pages = numPages;  }
    
    // Pages accessor.
    public int getPages()    {   return pages;  }
}