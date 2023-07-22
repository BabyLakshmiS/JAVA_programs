package NIGHTCLS;
import java.util.*;
public class abbbccc {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,n1,n2,n3,i;
		char A,B,C;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
	    A=sc.next().charAt(0);
	    B=sc.next().charAt(0);
	    C=sc.next().charAt(0);
		for(i=0;i<n1;i++)
		{
			System.out.print(A);
		}
		for(i=0;i<n2;i++)
		{
			System.out.print(B);
		}
		for(i=0;i<n3;i++)
		{
			System.out.print(C);
		}
		System.out.print("\n");
		n=(n1+n2+n3)/3;
		for(i=0;i<n;i++)
		{
			System.out.print(A);
		}
		for(i=0;i<n;i++)
		{
			System.out.print(B);
		}
		for(i=0;i<n;i++)
		{
			System.out.print(C);
		}
	}

}
