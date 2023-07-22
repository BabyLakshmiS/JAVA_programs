package batchtest;

import java.util.Scanner;

public class median {
	public static void main(String[]args)
	{
		int n,i,median,count=0,median2;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(n%2!=0)
		{
			median=n/2;
			System.out.println(arr[median]);
		}
		else
		{
			for(i=0;i<n;i++)
			{
				count=count+arr[i];
			}
			median2=count/4;
			System.out.println((float)median2);
		}
	}	

}
