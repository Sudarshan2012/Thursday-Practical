/*Write a program to create thread.
Where you will take the input from the user and find if the number is odd or even.*/

package practicalpackage;           //creating a package
import java.util.Scanner;           //importing scanner file
class Number extends Thread       //creating class and extends thread
{
	 public void run()           //creating a method
	{
		    Scanner sc=new Scanner(System.in);      //creating a scanner class
			System.out.println("Enter the number:");   
			int number=sc.nextInt();                //get the number from user
			if(number%2==0)                        //if conditon
			{
				System.out.println("Number is Even");
			}
			else                                    //else condition
			{
				System.out.println("Number is Odd");
			}
	}
	
}

public class UseThread                          //main class
{
	public static void main(String[] args)     //main method
	{
		Number n=new Number();               //creating object for Number class
		n.start();                           //call start() method
	}

}
