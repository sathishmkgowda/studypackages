package SeleniumJavaAssignment;

public class AssSele6 
{

	public static void main(String[] args)
	{
		String S="KARANATAKA";
		String S1=S.toLowerCase();
		int  count=0;
		for(int i=0;i<S1.length();i++)
		{
			char c=S1.charAt(i);
			if(c==i)
			{
			count++;
			}
			System.out.println(c+" "+count);
		}
		
		
	}
}


