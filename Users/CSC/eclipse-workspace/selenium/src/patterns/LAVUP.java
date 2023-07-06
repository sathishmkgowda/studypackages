package patterns;

public class LAVUP 
{
	void L()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==5 || j==1)
				{
					System.out.print("* ");
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
    void A()
    {
		int n=5;
		int  row=n;
		int coloum=n;
		for(int i=1; i<=5; i++)
		{
		for(int j=1; j<10; j++)
		{
			if(j==row || j==coloum || i==3 && j==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		row++;
		coloum--;
		System.out.println();
	}
		System.out.println();

	}
    void V()
    {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==j || i==1 && j==9 || i==2 && j==2 || i==2 && j==8 || i==3 && j==3 || i==3 && j==7 || i==4 && j==6)
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
    void U()
    {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1 && j==1 || i==1 && j==5 || i==2 && j==1 || i==2 && j==5 || i==3 && j==1 || i==3 && j==5 || i==4 && j==1 || i==4 && j==5 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4)
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

    public static void main (String[] args)
    {
    LAVUP l=new LAVUP();
    l.L();l.A();l.V();l.U();
    }
}
