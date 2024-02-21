//create an array for storing 10 student marks

import java.util.Scanner;
class Student_Marks
{
	public static void main(String args[])
	{
		int marks[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks");
		//getting input for an array
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter marks for student "+(i+1));
			marks[i] = in.nextInt();
		}
		

		System.out.println("The marks are");
		//print the values in the array
		int sum=0;
		for(int i=0;i<10;i++){
			System.out.println("Student "+(i+1)+" "+marks[i]);
			sum = sum + marks[i];
		}
	}
}

















