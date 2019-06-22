package com.basics.pro;

import java.util.Scanner;

public class Max
{
	public static int max(int a,int b)//method to find max value
	{
		if(a>b)
		{
		System.out.println(" Maximum value is "+a);
		return a;//returns x
		}
		else if(b>a)
		{
			System.out.println(" Maximum value is "+b);
			return b;//returns b
		}
		else
		{
			System.out.println("Botha values are equal i.e."+a+" = "+b);
			return 0;
		} 
	}
		public static void main(String [] args) {
			Scanner s=new Scanner(System.in);//scanner class is used to take input from keyboard
			System.out.println("enter first value");
			int s1=s.nextInt();//storing values in integer type
			System.out.println("enter second value");
			int s2=s.nextInt();//storing values in integer type
			max(s1,s2);//method calling statement
			
		}
}
