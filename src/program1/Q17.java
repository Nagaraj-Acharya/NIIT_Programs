package program1;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Q17 {

	public static void main(String[] args)
	{
	
		int num=3567;
		for(char ch:Integer.toString(num).toCharArray())
		{
			int digit=ch -'0';
			System.out.println(digit*digit);

		}
		
}}
