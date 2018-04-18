package program1;

import java.util.Scanner;

public class set5_Q4 {

	public static void main(String[] args)
	{
    Scanner sc= new Scanner(System.in);
    int num;
    
    System.out.println("Enter the number");
    num=sc.nextInt();
    System.out.println("the sum is::"+count(num));

    
	}
    public static int count(int num)
    {
    	int sum=0;
    while(num>0)
    {
    	int rem=num%10;
    	
    	 sum=sum+(rem*rem);
    	num=num/10;
    }
	return sum;
	
	}

}
