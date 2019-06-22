package com.basics.pro;

import java.util.Scanner;
class Eligible
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter 10th percentage:");
double tper=sc.nextDouble();
System.out.println("Enter 12th percentage:");
double pper=sc.nextDouble();
System.out.println("Enter degree percentage:");
double dper=sc.nextDouble();

boolean rs=tper>=60||pper>=60||dper||60;

System.out.println("is hr eligible?"+rs);
}
}