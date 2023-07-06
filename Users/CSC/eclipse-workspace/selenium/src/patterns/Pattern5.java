package patterns;

public class Pattern5 {

	public static void main(String[] args) 
	{
		int space=0;
		for(int i=4;i>=1;i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
				System.out.println();
				space++;
			}
		}

	}

