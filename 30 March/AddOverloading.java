/*Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 
3 values method with 3 parameters should be called*/

class Overloading                          //creating class  
{
 public void add(int a,int b)             //creating method for 2 parameters
  {
    System.out.println("I am print method with 2 parameters:");
  }
  public void add(int a, int b,int c)    //creating method for 3 parameters
  { 
    System.out.println("I am print method with 3 parameters:");
  }
}
public class AddOverloading
{
   public static void main(String args[])   //main method
   {
     Overloading a=new Overloading();      //creating objects
	 a.add(10,20);                         //caliing method for 2 parameters
	 a.add(10,20,30);                      //caliing method for 2 parameters
   }
}