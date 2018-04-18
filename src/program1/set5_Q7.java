package program1;

import java.util.Scanner;

public class set5_Q7 {

	public static void main(String[] args)
	{
		String str;
		//int num=0;
		//int counter=0;
		//int counter1=0;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String::");
		str=sc.nextLine();
		sumdigit(str);
	}
		
		
		public static void sumdigit(String str)
		{
			int sum=0;
			for(int i=0; i<=str.length();i++)
			{
				char a=str.charAt(i);
				if(Character.isDigit(a))
				{
					int b=Integer.parseInt(String.valueOf(a));
					sum=sum+b;
				}

			}
			if(sum==0)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(sum);

			}
		}
		///int sum=0;
		
		/*for(int i=0; i<=str.length();i++)
		{
			char c=str.charAt(i);
			
			Character charc= new Character(c);
			
			if(charc.isDigit(charc))
				counter++;
				else
					counter++;
	
	}
		System.out.println("number of digit is"+counter);
		System.out.println("number of digit is"+counter1);
*/
			/*if(Character.isDigit(c))
			{
				num++;
				//sum=sum+str.charAt(i);
			}*/
		

		

	

}
