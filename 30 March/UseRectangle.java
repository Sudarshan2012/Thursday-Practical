/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
   two methods to print the area and perimeter of the rectangle respectively. 
   Its constructor having parameters for length and breadth is used to initialize length and breadth
   of the rectangle.
   Print the area and perimeter of a rectangle*/

class Rectangle          //creating a class
{
  double length;        // data member
  double width;         //data member
  double area;
  double perimeter;
  
  public void area(double rlength,double rwidth)  //creating method for area
  {
    this.length=rlength;
	this.width=rwidth;
	area= length * width;
	System.out.println("Area Of Rectangle:" +area);
  }
  
  public void perimeter(double rlength, double rwidth)     //creating method foe perimeter
  {
     this.length=rlength;
	 this.width=rwidth;
	 perimeter= 2 *(length + width);
	 System.out.println("Perimeter Of Rectangle:" +perimeter);
	 
  }
}
public class UseRectangle
{
  public static void main(String args[])              //main method
  {
     Rectangle r=new Rectangle();                    //creating object
	 r.area(5,5);                                    //calling method for area
	 r.perimeter(2,2);                               //calling method for perimeter
  }
}