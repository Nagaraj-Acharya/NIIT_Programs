package program1;

import java.util.Scanner;

public class set6_Q13
{

	public static void main(String[] args) 
	{
		int array[]={10,11,12,14,15};
		int j,a=0,rem;int b=0,count=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		j=s.nextInt();

		
		for(int i=0;i<array.length;i++){
			int num=array[i];
			if(num>j)
			{
				a=a+num;
				System.out.println("number" +array[i]);			
			}}
		
		count=count+a;
		System.out.println("Total"+count);

			while(count>0){
				rem=count%10;
				   b=b*10+rem;
				count=count/10;
				
			}
			System.out.println("reverse" +b);	
		
	}
	}


