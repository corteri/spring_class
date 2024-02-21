import java.util.Scanner;
class TwoDimArr
{
	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of students");
		int row = in.nextInt();
		System.out.println("Enter the number of marks");
		int col = in.nextInt();

		int st_ma[][] = new int[row][col];

		for(int i=0;i<row;i++)
		{	
			System.out.println("Enter marks for student "+(i+1));
			for(int j=0;j<col;j++)
			{
				System.out.print("subject "+(j+1));
				st_ma[i][j]= in.nextInt();	
			}
		}
		
	}
}