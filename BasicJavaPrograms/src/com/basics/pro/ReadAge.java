package com.basics.pro;

import java.util.Scanner;
class ReadAge
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("What is your name?");
String name=sc.next();

System.out.println("Hii"+name+"How old are you?");
int age=sc.nextInt();

System.out.println(name+"Your age was"+(age-5)+"five years back and it will be"+(age+5)+"after five years");
}
}
