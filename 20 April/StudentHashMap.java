/*Write a program to create HashMap (Key-Value) of Students and perform following operations on it:

1. Check if the map contains the mapping for specified key(105)

2. Count the number of key-value(size) mapping in a map.

3. Copy the mapping from specified map to another map */

package practicalpackage;   //creating a package
import java.util.HashMap;   
public class StudentHashMap   //creating class
{ 
	public static void main(String[] args) //main method
	{
		HashMap<Integer,String> s=new HashMap<Integer,String>();   //Creating a HashMap
		s.put(101, "Sudarshan");        //HashMap Elements
		s.put(102, "Sachin");
		s.put(103, "Anna");
		s.put(104, "RK");
		s.put(105, "AC");
		s.put(106, "Vijay");
				
		System.out.println("Hash Map Elements:" +s);  //printing HashMap
		
		if(s.containsKey(105))   // Check if the map contains the mapping for specified key(105) using if else
		{
			System.out.println("1)Map contains key value 105");
		}
		else
		{
			System.out.println("1)Map does not contains key value 105");
		}
		
		System.out.println("2)Size of the Map:" +s.size());  //Count the number of key-value(size) mapping in a map.
		
		HashMap<Integer,String> s1=new HashMap<Integer,String>(s);  //Copy the mapping from specified map to another map
		System.out.println("3)New Map:" +s1);
		
	}

}
