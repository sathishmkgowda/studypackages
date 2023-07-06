package SeleniumJavaAssignment;
import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) 
	{
		String S = "KARNATAKA";  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> charCount = new HashMap<>();  
		for (int i = S.length() - 1; i >= 0; i--)   
		{  
		if(charCount.containsKey(S.charAt(i)))   
		{  
		int count = charCount.get(S.charAt(i));  
		charCount.put(S.charAt(i), ++count);  
		}   
		else   
		{  
		charCount.put(S.charAt(i),1);  
		}  
		}  
		System.out.println(charCount);  
		}  
		}  