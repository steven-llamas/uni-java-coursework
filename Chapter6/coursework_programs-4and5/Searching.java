/* 
To be used with coursework_4.java
*/

public class Searching<T>
{   // Searches specified array of objects for target using a linear search.
    // Returns a reference to target object from array if found, & null otherwise.
    public T linearSearch(T[] list, T target)
    {
        int index = 0;    boolean found = false;
        while (!found && index < list.length)
        {
            if (list[index].equals(target))    found = true;
            else    index++;
        }
        if (found)    return list[index];
        else    return null;
    }
    // Searches the specified array of objects for the target using a binary search. 
    // Assumes the array is already sorted in ascending order when it is passed in. 
    // Returns a reference to target object from array if found, & null otherwise.
    public Comparable<T> binarySearch(Comparable<T>[] list,Comparable<T> target)
    {
        int min = 0; 
        int max = list.length-1; 
        int mid = 0;    
        boolean found = false;
        
        while (!found && min <= max)
        {
            mid = (min+max) / 2;
            if (list[mid].equals(target))    found = true;
            else
                if (target.compareTo((T)list[mid]) < 0)    max = mid-1;
                else    min = mid+1;
        }
        if (found)    return list[mid];
        else    return null;
    }
}