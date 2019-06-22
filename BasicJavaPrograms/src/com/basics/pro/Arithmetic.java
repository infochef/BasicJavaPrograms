package com.basics.pro;

import java.util.Scanner;
class Arithmetic
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any two integer");
int a=sc.nextInt();//4
int b=sc.nextInt();//3
int sum=a+b;
int diff=a-b;
int prod=a*b;
int qut=a/b;
int rem=a%b;
System.out.println("sum is:"+sum);
System.out.println("diff is:"+diff);
System.out.println("prod is:"+prod);
System.out.println("qut is:"+qut);
System.out.println("rem is:"+rem);
}
}
