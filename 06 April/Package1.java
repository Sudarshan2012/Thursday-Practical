/*Write a program using constructor overloading. create a class Person with Id, Name, Designation.
Ask the user what are his inputs and according to that call the constructor. 
For Eg: If he wants to add only ID and name then Desgination will be default data or 
else if he wants to add Name and designation then ID will be default data.*/

package ConstructorOverloading;         //creating a package
import java.util.Scanner;
class Person                          //create class
{
    int id;                            //data members
    String name;
    String designation;

   public Person(int id, String name)    //create 1 parameterized constructor with 2 parameter
	{
       this(id, name, "Default Designation");
   }

   public Person(String name, String designation)  //create 2 parameterized constructor with 2 parameter
	{
       this(0, name, designation);
   }

   public Person(int id, String name, String designation)   //create 3 parameterized constructor with 2 parameter
	{
       this.id = id;
       this.name = name;
       this.designation = designation;
   }

   public void display()          //create method to display
	{
       System.out.println("ID: " + id);
       System.out.println("Name: " + name);
       System.out.println("Designation: " + designation);
   }
}

public class Package1 
{
	   public static void main(String[] args)   //main method
		{
	       Scanner sc=new Scanner(System.in);   //scanner for input

	        System.out.println("Enter ID: ");   //getting id input from user
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Name: ");    //getting name input from user
	        String name = sc.nextLine();
	     

	        System.out.print("Enter Designation (Press Enter to skip): ");  //getting designation input from user
	        String designation = sc.nextLine();
	       

	        if (designation.isEmpty())          //if condition to check designation is empty or not
			{
	            Person person = new Person(id, name);  //creating  object for 1 parametrized constructor
	            person.display();                     //calling display metohd
	        } 
			else
			{
	            Person person = new Person(name, designation);  //creating  object for 2 parametrized constructor
	            person.display();                                //calling display metohd
	        }

	        sc.close();      //scanner is closed
		}
}
