package NIGHTCLS;
import java.util.*;
public class arraycross_add {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,median=2;
		n=sc.nextInt();
		int arr[]=new int[n];
		int result[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int brr[]=new int[n];
		for(i=0;i<n;i++)
		{
			brr[i]=sc.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			
			if(i==0 || i==n-2)
			{
				result[i]=arr[i]+brr[i+1];
			}
			if(i==n/2)
		   {
		      result[i]=arr[i]+brr[i];
		   }
		     if(i==n-4 || i==n-1) 
		    {
				result[i]=arr[i]+brr[i-1];
			}
					
				System.out.println(result[i]);
	    }
	}
}
