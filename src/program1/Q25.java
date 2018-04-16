package program1;

import java.util.Scanner;

public class Q25 
{

	public static int count_vowels(String str)
	{
		boolean b=true;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{
				count++;
			}

		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		String str;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string::");
		str=sc.nextLine();
		
		System.out.println("vowels in string::"+count_vowels(str));

		
		
	}
	
	
	

}
