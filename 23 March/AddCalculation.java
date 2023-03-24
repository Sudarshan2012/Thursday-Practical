/*writing program to creating a class Calculation,add methods addition,Substraction,
Multiuplication and division to it.Create objects and access those methods.*/

class Calculation      //creating  Calculation class 
{
   int a;             //data initialization
   int b;
   int add;
   int sub;
   int mul;
   double div;
   void addData(int a,int b)     // creating method for addition
   {
      add=a+b;
	 System.out.println("Addition: "+add);
   }
   void subData(int a,int b)    //creating method for Substraction
   {
      sub=a-b;
	 System.out.println("Substraction: "+sub);
   }
   void mulData(int a,int b)     //creating method for Multiplication
   {
      mul=a*b;
	 System.out.println("Multiplication: "+mul);
   }
   void divData(int a,int b)     //creating method for Division
   {
      div=a/b;
	 System.out.println("Division: "+div);
   }
}

public class AddCalculation
{
   public static void main(String args[])  //main method
   {
     Calculation c=new Calculation();    //creating objects
	 c.addData(20,10);                   //accessing method for addition	 
	 c.subData(20,10);                   //accessing method for Substraction
	 c.mulData(20,10);                   //accessing method for multiplication
	 c.divData(20,10);                   //accessing method for division
	 
   }	 
}