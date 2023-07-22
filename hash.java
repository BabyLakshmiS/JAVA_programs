package batchtest;
import java.util.*;

class hash {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,n;
        String s;
        System.out.println("enter string ");
        s=sc.nextLine();
        String[]words = s.split("");
        String s1=words[0];
        String s2=words[1];
        StringBuilder result=new StringBuilder();
        n=s2.length();
        for(i=0;i<s1.length();i++)
        {
            for(j=0;j<=i;j++)
            {
               result.append(s1.charAt(j));
            }
        }
        int limit= Math.min(i+1,n);
        for(k=0;k < limit; k++)
        {
           result.append(s2.charAt(k)); 
        }
        System.out.println(result.toString());
        result.setLength(0);
        System.out.print("\n");
        
    }
}