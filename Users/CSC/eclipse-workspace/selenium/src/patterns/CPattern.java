package patterns;

public class CPattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==4 && i==1 || j==3 && i==1 || j==2 && i==2 || j==1 
				&& i==3 || j==1 && i==4 || j==2 && i==5 || j==3 && i==6 || j==4 && i==6 )
				{
					System.out.print(" *");
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
