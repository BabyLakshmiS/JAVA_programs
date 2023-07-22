package NIGHTCLS;
import java.util.*;
public class diagnoladd {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,a=0,j,b=0;
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			arr[i][j]=sc.nextInt();
		    }
		}
		for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(i==j)
					{
			          a=a+arr[i][j];
				    }
				}
			}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i+j==n-1)
				{
		          b=b+arr[i][j];
			    }
			}
		}
			
			System.out.println("right diagnol value is "+a);
			System.out.println("left diagnol value is "+b);
			
	}
}


