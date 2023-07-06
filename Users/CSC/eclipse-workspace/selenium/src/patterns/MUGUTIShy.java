package patterns;

public class MUGUTIShy 
{
	void P1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 && j>1 || i==3 || i==5 &&  j<5 || j==1 && i==2 || j==5 && i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void P2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 || j==2 && i==3 || j==3 && i==3 || j==4 && i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void P3()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 && i==1 || j==5 && i==1 || j==2 && i==2 || j==4 && i==2 || j==3 && i==3 || j==3 && i==4 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}
	void P4()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==5 || j==1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		System.out.println();
	}
	void P5()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 && j==1 || i==1 && j==5 || i==2 && j==1 ||
				i==2 && j==5 || i==3 && j==1 || i==3 && j==5 || i==4 
			&& j==1 || i==4 && j==5 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			System.out.println();
	}

	public static void main(String[] args)
	{
		MUGUTIShy S=new MUGUTIShy();
		S.P1();
		S.P2();
		S.P3();
		S.P4();
		S.P5();
	}

}
