package program1;

import java.util.Scanner;

public class fibonacci
{
	
	
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("sum of fibonacci is::"+sumfib(n));

}
public static int sumfib(int n)
{
	int f1=1,f2=1,f3=0, f4=0;
	for(int i=0;i<=n;i++)
	{
		f1=f2;
		f2=f3;
		f3=f1+f2;
		f4+=f3;
	}
	return f4;
}

}
