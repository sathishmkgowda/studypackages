package patterns;

public class Bpattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==1 || j<=3 && i==1 || j==4 && i==2 || j==4 && i==4 || j==2 && i==5 || j==3 && i==5 || i==3 && j==3)
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

}
