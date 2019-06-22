package com.basics.pro;

import java.util.Scanner;
class Example2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principle amount:");
long p=sc.nextLong();
System.out.println("Enter the time:");
double t=sc.nextDouble();
System.out.println("Enter the rate of interest:");
float r=sc.nextFloat();
System.out.println("Entered p is:"+p);
System.out.println("Entered t is:"+t);
System.out.println("Entered r is:"+r);

double si=(p*t*r)/100;
System.out.println("simple interest is:"+si);
}
}
