package patterns;

public class SHYLUB 
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
		SHYLUB s=new SHYLUB();
		s.P1();
		s.P2();
		s.P3();
		s.P4();
		s.P5();
	}

}
