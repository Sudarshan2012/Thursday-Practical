/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
   Create a child class called "Car"that inherits from Vehicle and has an additional attribute called "color" and a method called "Type".
   Create an object of the Car class and call both the "drive" and "Type" methods.*/

class Vehicle                                //parent class vehicle
{
    String brand="KIA";                     // attributes
	String model="SELTOS";
	int year=2020;
	
	public void drive()                      //creating drive method
	{
	    System.out.println("Brand:" +brand+" Model:" +model+" Year:" +year);
	}
}
class Car extends Vehicle                    //child class Car
{
   String color="White";                     //attributes
    
	public void Type()                       //creating Type method
   {
       System.out.println("Color:" +color);
   }
}

public class UseVehicle  
{
 public static void main(String args[])     //main method
 {
    Car c=new Car();                        //creating object for Car class
	c.drive();                              //calling drive method
	c.Type();                               //calling type method
 }
}