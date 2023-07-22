package placements;
import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
		int n1,n2,i;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		{
		for(i=0;i<n1;i++)
		if(arr1[i]==arr2[i])
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
		
	}
}
}