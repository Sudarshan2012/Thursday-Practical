/*Write a program to take input of marks of 3 subjects from the user. 
Check if the total of marks given by the user is greater than 50 else throw 
an exception saying "You Failed". 
Or else print Grade is A if the total is greater than 280. 
Grade B if the total is greater than 200. 
Grade C if the total is greater than 150. Grade D if the total is greater than 50.*/

package practicalpackage;     //creating a package
import java.util.Scanner;     //importing scanner file
public class ExceptionThrow    //creating a class
{

	public static void main(String[] args) //main method
	{
		int total;                         //data members
		Scanner sc=new Scanner(System.in); //creating scanner class
		
		System.out.println("Enter marks of English");
		int english=sc.nextInt();                     //get marks of first subjects
		System.out.println("Entet marks of Math");
		int math=sc.nextInt();                         //get marks of Second subjects
		System.out.println("Enter marks of Science");
		int science=sc.nextInt();                       //get marks of Third subjects
		total=english+math+science;                      //calculating total of all subjects
		System.out.println("Total:" +total);           
		if(total<50)                            //if condition 
		{
			throw new ArithmeticException("You Failed");  //throw exception if total is less than 50
		}
		else if(total>280)                      //else if condition
		{
			System.out.println("Grade A");
		}
		else if(total>200)                     //else if condition
		{
			System.out.println("Grade B");
		}
		else if(total>150)                    //else if condition
		{
			System.out.println("Grade C");
		}
		else                                    //else condition
		{
			System.out.println("Grade D");
		}
	}

}
