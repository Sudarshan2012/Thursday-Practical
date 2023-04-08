/*Create an interface called "Playable" with a method called "play". 
Create two classes called "Song" and "Video" that implement the Playable interface and 
implement the "play" method. 
Create objects of both the Song and Video classes and call their respective "play" methods.*/

package Interface;

interface Playable                          //creating interface
{
   public void play();                      //creating play method

}

class Song implements Playable              //creating class implements from interface
{
   public void play()                     //implement play method for Song class
   {
     System.out.println("Implenting play method of Song Class");
   }
}
class Video implements Playable          //creating class implements from interface
{
   public void play()                    //implement play method for video class
   {
     System.out.println("Implenting play method of Video Class");
   }

}

public class UsePlayable               
{

	public static void main(String[] args) //main method
	{
		Song s=new Song();                 //creating object for Song class
		   s.play();                         //calling play method of song class
		   
		   Video v=new Video();              //creating object for video class
		   v.play();

	}

}
