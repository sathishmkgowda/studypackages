package SeleniumJavaAssignment;

public class SeleAss1 {

	public static void main(String[] args) 
	{
		String S="Selenium";
		String S1=S.toLowerCase();
		String R="";
		for(int i=S1.length()-1;i>=0;i--)
		{
			R=R+S1.charAt(i);
		}
		System.out.println(R);
	}

}
