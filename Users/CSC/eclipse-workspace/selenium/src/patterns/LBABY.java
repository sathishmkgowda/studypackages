package patterns;

public class LBABY {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=28;j++)
			{
				if(j==1 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4 || i==5 && j==5 || j==9 && i==1 || j==10 && i==2 || j==8
						&& i==2 || j==7 && i==3 || j==9 && i==3 || j==11 && i==3 || j==7 && i==4 || j==7 && i==5 || j==11 && i==3
						|| j==11 && i==4 || j==11 && i==5 ||  j==12 && i==1 || j==20 && i==1 || j==13 && i==2 || j==19 && i==2 ||
						j==14 && i==3 || j==18 && i==3 || j==15 && i==4 || j==17 && i==4 || j==16 && i==5 || j==22 && i==1 || j==28
						&& i==1 || j==22 && i==2 || j==28 && i==2 || j==22 && i==3 || j==28 && i==3 || j==23 && i==4 || j==27 && i==4
						|| j==24 && i==5 || j==25 && i==5 || j==26 && i==5)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


