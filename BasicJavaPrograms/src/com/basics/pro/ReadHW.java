package com.basics.pro;

import java.util.Scanner;
class ReadHW
{
  public static void main(String arg[])
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the height and weight");
  float h=scan.nextFloat();
  float w=scan.nextFloat();
 
 System.out.println("entered height is:"+h+" feet");
 System.out.println("entered weight is:"+w+"kgs");
}
}
