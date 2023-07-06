package patterns;

public class Vowels2 {

	public static void main(String[] args) 
	{
		String S="SudeepYash";
		String S1=S.toLowerCase();
		int count=0;
		for(int i=0; i<=S1.length(); i++)
		{
			char ch=S1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				System.out.println(ch+" "+i);
				
			}
				
		}

	}

}
