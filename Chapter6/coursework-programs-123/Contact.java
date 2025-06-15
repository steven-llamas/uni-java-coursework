/* Course: CS 460 Mobile Application Development
Module: 6. Binding, Sorting, & Searching       Contact.java, Represents a phone contact.
To be used with PhoneList.java (m6-p3.java)   */ 
public class Contact implements Comparable<Contact>
{
    private String firstName, lastName, phone; // Constructor: Sets up contact with specified data.
    public Contact(String first, String last, String telephone)
    {        firstName = first;    lastName = last;    phone = telephone;    }
    // Returns a description of this contact as a string.
    public String toString()  {    return lastName + ", " + firstName + "\t" + phone;    }
    public boolean equals(Object other)
    {   // Returns true if the first and last names of this contact match those of parameter.
        return (lastName.equals(((Contact)other).getLastName()) && firstName.equals(((Contact)other).getFirstName()));
    }
    public int compareTo(Contact other)
    {   // Uses both last and first names to determine ordering.
        int result;
        if (lastName.equals(other.getLastName()))    
				result = firstName.compareTo(other.getFirstName());
        else    result = lastName.compareTo(other.getLastName());
        return result;
    }
    public String getFirstName()    {    return firstName;    }    // First name accessor.
    public String getLastName()    {    return lastName;    }      // Last name accessor.
}