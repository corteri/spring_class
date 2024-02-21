import java.util.Scanner;
class Print_Loop
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i%5==0)
				continue;
			if(i==31)
				break;
			System.out.println(i);
		}
		in.close();
		
	}
}