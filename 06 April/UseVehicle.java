class Vehicle
{
    String brand;
	String model;
	int year;
	
	public void drive()
	{
	    System.out.println("Number is even");
	}
}
class Car extends Vehicle
{
   String color;
    
	public void Type()
   {
       System.out.println("Number is odd");
   }
}

public class UseVehicle
{
 public static void main(String args[])
 {
    Car c=new Car();
	c.drive();
	c.Type();
 }
}