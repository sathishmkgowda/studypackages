package SeleniumJavaAssignment;

public class SeleAssi5 {

	public static void main(String[] args) 
	{
		int P=1234321;
		int R=P;
		int sum=0;
		while(P!=0)
		{
			int rem=P%10;
			sum=(sum*10)+rem;
			P=P/10;
		}
			if(R==sum)
			{
				System.out.println("Its a palindrome");
			}
			else
			{
				System.out.println("Its not a palindrome");
			}
	}

}
