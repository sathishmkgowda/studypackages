package SeleniumJavaAssignment;

public class AssSele1 {

	public static void main(String[] args) 
	{
		int evencount=0;
		int oddcount=0;
		for(int i=1;i<=70;i++)
		{
			if(i%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
			System.out.println("Evencount is " + evencount);
			System.err.println("Oddcount is " + oddcount);
	}

}
