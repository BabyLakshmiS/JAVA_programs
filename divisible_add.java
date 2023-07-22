package batchtest;
import java.util.*;
public class divisible_add {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int m,n,sum1=0,i,sum2=0,sum3,diff;
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);
		for(i=1;i<=n;i++)
		{
			if(i%4==0)
			{
				sum2=sum2+i;
			}
		}
		System.out.println(sum2);
		sum3=sum1-sum2;
		System.out.println(sum3);
		diff=sum3-sum2;
		System.out.println(diff);
	}

}
