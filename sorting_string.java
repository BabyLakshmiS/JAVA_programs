package placements;
import java.util.*;
public class sorting_string {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int i,l=0,len=0,len1=0;
		String a;
		System.out.println("enter string ");
		a=sc.nextLine();
		for(i=0 ; i < a.length(); i++)
		{
			
			if(a.charAt(i) == ' ')
			    {
				  l++;
			    }
			if(l==0)
			   {
				  len++;
			   }
			else
			{
				len1++;
				
			}
	    }
		System.out.println(l);
		System.out.println(len);
		System.out.println(len1-l);

}
}