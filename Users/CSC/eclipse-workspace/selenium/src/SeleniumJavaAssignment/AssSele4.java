package SeleniumJavaAssignment;

public class AssSele4 {

	public static void main(String[] args) 
	{
		String S1="hello";
		String S2="world";
		S1=S1+S2;
		S2=S1.substring(0, S1.length()-S2.length());
		S1=S1.substring(S2.length());
		System.out.println(S2);
		System.out.println(S1);

	}

}
