package com.basics.pro;

import java.util.Scanner;
class Result1
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter four subject marks");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();

boolean rs=m1>=35&&m2>=35&&m3>=35&&m4>=35;

System.out.println("Result is:"+rs);
}
}