package batchtest;
import java.util.*;
public class length_last_word {

	public int lengthOfLastWord(final String a)
	{
		int len = 0;

		
		String x = a.trim();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ')
				len = 0;
			else
				len++;
		}

		return len;
	}

	
	public static void main(String[] args)
	{
		String a;
		Scanner input = new Scanner(System.in);
		a=input.nextLine();
		
		length_last_word gfg = new length_last_word();
		System.out.println("The length of last word is "
						+ gfg.lengthOfLastWord(a));
	}
}