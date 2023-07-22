package batchtest;
import java.util.*;
public class repeatedelements {
	public static void main()
	{
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
		}
	
		System.out.println(count);
	}

}
