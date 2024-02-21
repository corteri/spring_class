class Calculator
{
	//with returntype, with arguments
	int add1(int x, int y)
	{
		int total = x+y;
		return total;
	}

	//without returntype, with arguments
	void add2(int x, int y)
	{
		System.out.println(x+y);
	}
	//with returntype, without arguments
	int add3()
	{
		int x=5;
		int y =6;
		return x+y;
	}
	//without returntype, without arguments
	void add4()
	{
		int x=5;
		int y=6;
		System.out.println(x+y);
		
	}
	/*
	int sub(int x, int y)
	{
		int total = x-y;
		return total;
	}*/

}

class CalcDemo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		//object for the class
		//syntax: classname objname = new classname();
		Calculator obj = new Calculator();
		//syntax: object.classmember
		while(1)
		{
			System.out.println("Enter the option");
			int n=in.nextInt();
			System.out.println("Enter the values");
			int v1 = in.nextInt();
			int v2 = in.nextInt();
			switch(n)
			{
				case 1:int z = obj.add1(v1,v2);
					System.out.println(z);
					break;
				case 2:obj.add2(v1,v2);
					break;
				case 3:int z = obj.add3();
					System.out.println(z);
					break;
				case 4:obj.add4();
					break;
				default:System.out.println("Enter correct option");
	
			}
			if(n>4)
				break;	
		}
	
	}

}

