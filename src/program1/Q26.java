package program1;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
    String str="mappping";
    char[] inp=str.toCharArray();
    int count=0;
   
    for(int i=0;i<str.length();i++)
    {
        for(int j=i+1;j<str.length();j++)
        {
        	if(inp[i]==inp[j])
        	{
        		System.out.println(inp[j]);
        		count++;
        		break;
        	}
        }
    }
   	
}

}
