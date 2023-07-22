package NIGHTCLS;
import java.util.*;
public class addoddsum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,a,b,c,d,sum;
		n=sc.nextInt();
		//int arr[]=new int[n];
		//for(i=0;i<n;i++)
		a=n%10;
		b=n/10;
		c=b%10;
		d=b/10;
		System.out.print(a);
		System.out.print(c);
		System.out.println(d);
		if(n%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
		sum=a+c+d;
		System.out.println(sum);
	}

}
