package patterns;

public class Apattern {

	public static void main(String[] args)
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

}
