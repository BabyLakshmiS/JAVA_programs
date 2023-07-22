package NIGHTCLS;
import java.util.*;
public class findminvalarray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i,j;
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			arr[i][j]=sc.nextInt();
		    }
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
		    }
		}
		int min=arr[0][0];
		int max=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println("\n");
		System.out.println("max is "+max);
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i][j]<=min)
				{
					min=arr[i][j];
				}
			}
		}
		//System.out.println("\n");
		System.out.println("min is "+min);
	
	}
}
