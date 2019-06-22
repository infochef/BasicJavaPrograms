package com.basics.pro;

import java.util.Scanner;
class Arithmetic1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First value:");
int n1=sc.nextInt(); 
System.out.println("Enter the Second value:");
int n2=sc.nextInt(); 
System.out.println(n1+"+"+n2+"="+(n1+n2));
System.out.println(n1+"-"+n2+"="+(n1-n2));
System.out.println(n1+"*"+n2+"="+(n1*n2));
System.out.println(n1+"/"+n2+"="+(n1/n2));
System.out.println(n1+"%"+n2+"="+(n1%n2));
}
}