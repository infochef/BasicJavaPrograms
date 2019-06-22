package com.basics.pro;

import java.util.Scanner;
class BMI
{
public static void main(String aeg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String name=sc.next();

System.out.println(name+"Enter your weight and height in terms of kgs and feet");
double w=sc.nextDouble();
double h=sc.nextDouble();

h=h/3.3;

double bmi=w/(h*h);
System.out.println(name+"your bmi is:"+bmi);

}
}
