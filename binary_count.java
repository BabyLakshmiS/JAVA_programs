package placements;
import java.util.*;
public class binary_count {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int i,n,c=0,d=0,count_one=0,count_zero=0;
		int arr[]=new int[100];
		n=sc.nextInt();
		for(i=0;n>0;i++)    
		{    
		 arr[i]=n%2;    
		 n=n/2;    
		} 
		for(i=i-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		if(arr[i]==1)
		{
			c++;
		}
		else
		{
			d++;
		}
		}
		while(n>0)
		{
			if(n & 1)
			{
				count_one++;
			}
			else
			{
				count_zero++;
			}
			n=n>>1;
		}
	//System.out.println("\n1s count is "+c);
	//System.out.println("0s count is "+d);
		System.out.println("\n1s count is "+count_one);
		System.out.println("\n1s count is "+count_zero);

	
	}
}
