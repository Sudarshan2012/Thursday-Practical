//program to find largest number among three numbers.

class Greatest            // creating class
{
  public static void main(String args[])    //main method
  {
    int a=10,b=45,c=30;     
	if( a>b && a>c)        //if condition
	{
	  System.out.print("A is greater:");
	}
    else if(b>c && b>a)      //else if condition
	{
	  System.out.println("B is greater:");
	}
	else                      //else condition
	{
	 System.out.println("C is largest:");
	}
  }
}