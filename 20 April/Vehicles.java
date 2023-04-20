/*Write a java program to create an ArrayList (Name of Vehicles) with 10 elements and do the following things:

1. Print the arraylist.

2. Iterate through the Array List and print the arraylist

3. Insert an element at start and end of arraylist.

4. retrieve an element at index number 4.

5. update the element at index number  7 with vehicle name XUV300.

6. Search for the element "verna" if it is found just print 'found the vehicle' else print 'not found'

7. Copy this arraylist to the new arraylist */

package practicalpackage;    //creating a package
import java.util.ArrayList;  //
public class Vehicles       //creating a class
{
	public static void main(String[] args)  //main method
	{
		ArrayList<String> v=new ArrayList<>();     //creating arraylist
		v.add("Car");                            //array list elements
		v.add("Bus");
		v.add("Bike");
		v.add("Jeep");
		v.add("Auto");
		v.add("Bicycle");
		v.add("Scooty");
		v.add("Taxi");
		v.add("SUV");
		
		System.out.println("1)ArrayList of Vehicles:" +v);    //printing the arraylist
		
		System.out.println("2)Iterate through the Array List and print the arraylist:"); 
		for(String i:v)    // Iterate through the Array List and print the arraylist using for loop
		{
			System.out.println(i);
		}
		
		v.add(0,"Truck");  //adding an element at start
		v.add("Tractor");  //adding an elemnet at end
		System.out.println("3)After Inserting an element at start and end of arraylist:" +v);
		
		String element=v.get(4);   //retrieve an element at index number 4 
		System.out.println("4)After retrieve an element at index number 4:" +element);
		
		v.set(7, "XUV300");      //update an element at index number 7
		System.out.println("5)After update the element at index number  7 with vehicle name XUV300:" +v);
		
		if(v.contains("verna"))   //search the element
		{
			System.out.println("6)Found the vehicle:");
		}
		else
		{
			System.out.println("6)Vehicle Not Found:");
		}
		
		ArrayList<String> v1=new ArrayList<>(v);  //Copy this arraylist to the new arraylist
		System.out.println("7)New arraylist:" +v1);
		
	}

}
