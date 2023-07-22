package NIGHTCLS;
import java.util.*;
public class vpattern {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k,l;
		n=sc.nextInt();
		for (i=1;i<=n;i++) 
		{
			for (j = 1 ; j <= i; j++ ) 
			{
				System.out.print("*");
			}
			for (k=1;k<=2*(n- i);k++ ) 
			{
				System.out.print(" ");
			}
			for (l=1;l<=i;l++ ) 
			{
			System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
