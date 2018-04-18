package program1;

import java.util.Scanner;

public class fibonacci
{
	
	
public static void main(String args[])
{
	/*int f1=0,f2=0,f3=1, num,sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
 	 num=sc.nextInt();
 	
 	for(int i=0;i<num;i++)
 	{
 		f1=f2;
 		f2=f3;
 		f3=f1+f2;
 		System.out.println(+f1);
 	}
 	sum=sum+f3;
 	
   System.out.println("sum of fibonacci series is::"+sum);

 	*/
 	
	{
		int n,a=1,b=1,sum=a+b;
		System.out.println("enter fibbonacci number");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		
		for( int i=2;i<n;i++){
			int temp=a+b;a=b;b=temp;
			sum=sum+temp;}
	System.out.println("sum:::"+sum);	
	}
}

}
