package program1;

import java.util.Scanner;

public class Q3
{
	public static int maxDiff(int[] array)
	{
		
		int maxdif[]={1,5,6,9,8}; 
		int diff=0,result=0;
		
		for(int i=0;i<=array.length;++i)
		{
			diff=array[i+1]-array[i];	
			
			if(result<diff)
			{
				result=diff;
			}
			//return result;

		}
		return result;
		
	}
	
	
	public static void main(String[] args)
	{
		//Scanner sc =new Scanner(System.in);
		
		//System.out.println(maxDiff(array));
		//System.out.println("difference is"+maxdiff(array));
	}

}
