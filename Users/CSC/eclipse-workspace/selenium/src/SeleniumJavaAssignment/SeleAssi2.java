package SeleniumJavaAssignment;

public class SeleAssi2 {

	public static void main(String[] args) 
	{
		int[] la={28,45,36,87,66,55,99};
		int larg=la[0];
		for(int i=0;i<la.length;i++)
		{
			if(la[i]>larg)
			{
				larg=la[i];
			}
		}
			System.out.println(larg);
	}

}
