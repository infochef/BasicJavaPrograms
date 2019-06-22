package com.basics.pro;

import java.util.Scanner;
class Example1
{
   public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String name=sc.next();
 System.out.println("Enter your mobile no");
 long mob=sc.nextLong();
 System.out.println("Entered name:"+name);
 System.out.println("Entered mobile no:"+mob);
}
}