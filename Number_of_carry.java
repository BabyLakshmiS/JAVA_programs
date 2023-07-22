package batchtest;
import java.util.*;
public class Number_of_carry {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,n1,m1,n2,m2,carry=0,rem1,rem2;
		n=sc.nextInt();
		m=sc.nextInt();
		n1=n%10;
		rem1=n/10;
		System.out.println(n1);
		m1=m%10;
		rem2=m/10;
		System.out.println(m1);
		n2=rem1%10;
		System.out.println(n2);
		m2=rem2%10;
		System.out.println(m2);
		if(n1+m1>9)
		{
			carry++;
		}
		if(n2+m2>9)
		{
			carry++;
		}
		System.out.println(carry);
	}

}
