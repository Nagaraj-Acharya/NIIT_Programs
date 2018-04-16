package program1;

import java.util.Scanner;

public class Q22 
{

	public static void main(String[] args) 
	{
	int count=0;
	int array1[]={1,2,3,4,5,6,7};
	int array2[]={1,2,3,4,5};

	for(int i=0;i<array1.length;i++)
	{
	for(int j=0;j<array2.length;j++)
	{
		if(array1[i]==array2[j])
		{
		System.out.println(array1[i]);
		count++;
		}
	}
	}
	System.out.println("count::"+count);

	}

}
