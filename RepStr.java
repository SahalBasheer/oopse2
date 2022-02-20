//5. Program to replace a particular character in a string.

import java.util.*;

public class RepStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		
		System.out.println("Enter the word:");
		s1=sc.nextLine();
		int x,y;
		String s2;
		System.out.println("Enter the postion of the character to be replaced:");
	   x=sc.nextInt();
	  y=x-1;
	  System.out.println("Enter the character with which to be replaced:");
		s2=sc.next();
		System.out.println("Replaced string:"+s1.substring(0,y)+s2+s1.substring(x));
		
	}
}
