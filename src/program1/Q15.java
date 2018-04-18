package program1;

import java.util.Scanner;

public class Q15
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
      String str,reverse="";
      System.out.println("Enter the String::");
      str=sc.nextLine();
      
      for(int i=str.length()-1;i>=0;i--)
      {
    	  reverse=reverse+"-"+str.charAt(i);  
      }
      System.out.println("Reverse String is String::"+reverse);
	}

}
