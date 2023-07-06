package SeleniumJavaAssignment;

public class AssSele5 {

	public static void main(String[] args) 
	{
		String S="GC18ELF2022 JUNE 14";
		String P=S.substring(2,4);
		String R=S.substring(7,11);
		String L=S.substring(15);
		
		int C=Integer.parseInt(P)+Integer.parseInt(R);
		System.out.println(C);

	}

}
