package SeleniumJavaAssignment;

public class AmazonSele
{
	static void coupon() throws AmazonException
	{
		int cartamt=999;
		if(cartamt==999)
		{
			System.out.println("Coupon applied");
		}
		else
		{
			throw new AmazonException("Coupon not applied");
		}
	}
	public static void main(String[] args) throws AmazonException 
	{
		try
		{
			coupon();
		}
		catch(AmazonException a)
		{
			System.out.println(a.gettext());
		}
	}
}
class AmazonException extends Exception
{
	String text;
	AmazonException(String text)
	{
		this.text=text;
	}
	public String gettext()
	{
		return text;
	}

	}


