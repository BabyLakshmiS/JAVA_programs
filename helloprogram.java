package NIGHTCLS;
import java.util.*;
public class helloprogram {
	public static void main(String []args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(i=1;i<str.length();i++)
		{
			System.out.print(" ");
		}
		for(i=0;i<str.length();i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for(i=1;i<str.length();i++)
		{
			System.out.print("*");
		}
		System.out.print(str);
		for(i=1;i<str.length();i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for(i=1;i<str.length();i++)
		{
			System.out.print(" ");
		}
		for(i=0;i<str.length();i++)
		{
			System.out.print("*");
		}
	}

}
