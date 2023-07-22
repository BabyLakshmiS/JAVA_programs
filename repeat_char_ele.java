package batchtest;
import java.util.*;
public class repeat_char_ele {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		String a;
		a=sc.nextLine();
		for(i=0;i<a.length();i++)
		{
			if( a.charAt(i) == a.charAt(i+1) )
			{
				System.out.println(a.charAt(i));
			}
		}
	}

}
