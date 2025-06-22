/*
Filename: Book2.java (file 1 for Words2.java)  
Represent a book, used as parent of derived class to demonstrate inheritance & use of super reference.
*/

public class Book2
{
	protected int pages = 1500;
	
	// Constructor: setup book with specified no. of pages
    public Book2 (int numPages) { pages = numPages; }
    // Pages mutator.
    public void setPages(int numPages) {    pages = numPages;  }
    // Pages accessor.
    public int getPages()    {   return pages;  }
}