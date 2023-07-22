package NIGHTCLS;
import java.util.*;
public class arrayreverseadd {
	public static void main(String[]args)
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[n];
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<arr1.length;i++)
		{
			for(j=arr2.length;j>0;j--)
			//for(j=0;j<arr2.length;j++)
			{
				arr[i]=arr1[i]+arr2[j];
			}
		}
		System.out.println(arr[i]);
	}
}


