/*Create two thread.one thread is finding average of first 50 numbers 
 * and other thread is printing square of number store in array arr={10,15,20,25,30}.*/

package practicalpackage;          //creating Package

class AverageThread extends Thread  //create class and extends threads
{
	float sum;                //data members
	float avg;
	public void run()               //override run() method
	{
	 for(int i=1;i<=50;i++)    //run for lopps 5o times
	 {
		 sum=sum+i;           // calculate sum
	 }
	 //System.out.println("Sum Of first 50 numbers is:" +sum);      //print sum
	 avg=(sum/50);                                                  //calculate average
	 System.out.println("Average Of first 50 numbers is:" +avg);	//print average 
	}
}
class SquareThread extends Thread         //create a class and extends thread
{    
	int[] arr= {10,15,20,25,30};        //initialize array with elements
	
	public void run()                 //override run()method
	{
		
		for (int i = 0; i < arr.length; i++) //run for loop upto length of array
		{
            System.out.println("Square of " + arr[i] + " = " + (arr[i] * arr[i]));  //print array elements with squares
	}
	}
}


public class TwoThread           //main class
{

	public static void main(String[] args)  //main method
	{
		AverageThread t1=new AverageThread();  //create object for AverageThread class
		SquareThread t2=new SquareThread();    //create object for SquareThread class
		t1.start();                          //call start() method
		t2.start();                        //call start() method

	}

}
