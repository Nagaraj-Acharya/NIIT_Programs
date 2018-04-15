package program1;

import java.util.Scanner;

public class sumofnumber 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1,sum=0;
		
		System.out.println("Enter a number");
		num1=sc.nextInt();
		 
		while(num1>0)
		{
			sum=sum+num1 % 10;
			num1/=10;
		}
		
		System.out.println("sum of the number is....:"+ sum);
	
		
	{
		//public void String ()
		
	if(sum%2==0)
	{
	
		System.out.println("The given number is even");
	}
	else
	{
		System.out.println("The given number is odd");
		//return +1;

	}
		}
	
	}
	}
