package placements;
import java.util.*;
public class recursive {
	public static void main(String[]args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		natural_number(n);
    }
public static void natural_number(int n) 
{
	if(n==1)
	{
		System.out.println(1);
	}
	else
	{
		System.out.println(n);
		natural_number(n-1);
	}
 }
}