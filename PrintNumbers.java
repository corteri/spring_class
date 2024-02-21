//print the numbers from 1 to n
import java.util.Scanner;
//define a class
class PrintNumbers
{
	//main method
	public static void main(String args[])
	{
		//declare the variables
		int n; //n --> to get input from user 

		//create one scanner object
		Scanner in = new Scanner(System.in);
		//get input from the user
		n = in.nextInt();

		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		
		in.close();
	}

}