/*Write a program to create a LinkedList(Colors) using collections in java and perform following operations on them:

1. Append "Red" at the end of the linked list

2. Iterate through all the elements of the linkedlist starting from the element 4

3. Iterate the linked list in the reverse order. */

package practicalpackage;                           //creating a package
import java.util.Iterator;
import java.util.LinkedList;
public class ColorsLinkedList                        //creating a class
{

	public static void main(String[] args)          //main method
	{
		LinkedList<String> c=new LinkedList<>();    //creating linked list
		c.add("Violet");                            //LinkedList elements
		c.add("White");
		c.add("Orange");
		c.add("Yellow");
		c.add("Pink");
		c.add("Blue");
		c.add("Black");
		c.add("Green");
		c.add("Brown");
		
		System.out.println("1)LinkedList Of Colors:"  + c);  //printing linked list of colors
		
		c.addLast("Red");                                   //appending Red at the end of the linked list
		System.out.println("2)After appending Red at the end of the linked list:"  + c);
		
		System.out.println("2)Iterate through all the elements of the linkedlist starting from the element 4:");
		for(int i=4;i<c.size();i++)     // Iterate through all the elements of the linkedlist starting from the element 4
		{
			System.out.println(c.get(i));
		}
		
		Iterator it =c.descendingIterator();             // Print linkedlist elements in reverse order
	     System.out.println("3)Elements in Reverse Order:");
	     while (it.hasNext())
	     {
	        System.out.println(it.next());
	     }
	}

}
