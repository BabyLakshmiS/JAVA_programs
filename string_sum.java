package batchtest;
import java.util.*;
public class string_sum 
{
	 public static void main(String[] args) 
	 {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String baby = "";
	        for (int i = 0; i < n; i++)
	        {
	            String aby = sc.next();
	            if (aby.length() % 2 == 1 && aby.length() > baby.length()) 
	            {
	                baby = aby;
	            }
	        }
	        if (baby.equals(""))
	        {
	            System.out.println("better luck next time");
	        }
	        else
	        {
	            System.out.println(baby);
	            
	        }
	        
	    }
	}