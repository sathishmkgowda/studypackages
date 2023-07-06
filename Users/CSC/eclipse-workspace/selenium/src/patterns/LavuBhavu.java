package patterns;

public class LavuBhavu {

	public static void main(String[] args) 
	{
		String S="LavanyaBhavani";
		String S1=S.toLowerCase();
		for(int i=0;i<S1.length();i++)
		{
			char ch=S1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
				
			{
				System.out.println(ch);
			}
		}
			
		
		
	

	}

}
