package NIGHTCLS;
import java.util.*;
public class transposematrix {
	public static void main(String[]args)
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
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
				System.out.print(arr[j][i]+" ");
			}
			System.out.print(" \n");
		}
		
	}

}
