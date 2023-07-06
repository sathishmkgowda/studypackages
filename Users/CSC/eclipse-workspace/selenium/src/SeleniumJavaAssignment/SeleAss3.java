package SeleniumJavaAssignment;

public class SeleAss3 {

	public static void main(String[] args) 
	{
		int sum=0;
		int count=0;
		for(int i=10;i<=50;i++)
		{
			if(i%2==1)
			{   sum=sum+i;
				System.out.println(i);
				count++;
			}
		}
        System.out.println("The odd number count between 10 to 50 is equals to  "+count);
        System.out.println(sum);
	}

}
