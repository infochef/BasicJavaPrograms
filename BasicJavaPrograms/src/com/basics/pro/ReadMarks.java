package com.basics.pro;

import java.util.Scanner;
class ReadMarks
{
 public static void main(String arg[])
{
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the marks of pcmb:");
 
	int p=scan.nextInt();
	int c=scan.nextInt();
	int m=scan.nextInt();
	int b=scan.nextInt();

System.out.println("entered physics marks is:"+p);
System.out.println("entered chemistry marks is:"+c);
System.out.println("entered mathematics marks is:"+m);
System.out.println("entered bilogy marks is"+b);
}
}
