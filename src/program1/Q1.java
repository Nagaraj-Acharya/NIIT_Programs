package program1;

import java.util.Scanner;

public class Q1 
{
		public static int addnumber(int num1)
		{
			int sum=0;
			while(num1>0)
			{
				int i=num1%10;
				
				if(i%2!=0)
				{
					sum+=i;		
			    }
				num1=num1/10;
		    }
			return sum;
		}
		
		
		public static int checknumber(int sum)
		{
			if(sum%2==0)
			{
				return -1;
			}
			else
			{
				return +1;

			}
		}
	
		
		public static void main(String args[])
		{
			int sum=0;
			Scanner sc = new Scanner(System.in);
			int num1;
			
			System.out.println("Enter a number::.....");
			num1=sc.nextInt();
			 
			System.out.println("sum of the number is....:"+ addnumber(num1));
			System.out.println(checknumber(sum));

     	}
	
	}//class close
