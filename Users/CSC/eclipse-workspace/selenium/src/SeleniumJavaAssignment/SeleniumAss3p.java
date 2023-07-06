package SeleniumJavaAssignment;
import java.util.LinkedHashSet;

public class SeleniumAss3p 
{
	public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        System.out.print(set);
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,2,3,4,4,5,6,6,7};
        removeDuplicates(a);
    }
}
	
	
	
