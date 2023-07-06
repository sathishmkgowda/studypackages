package patterns;

public class Vowels3 {

	public static void main(String[] args) 
	{
		String S="SudeepYash";
		String S1=S.toLowerCase();
		char[] arr=S1.toCharArray();
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
			{
				System.out.println(arr[i]);
			}
		}
			
	}

}

