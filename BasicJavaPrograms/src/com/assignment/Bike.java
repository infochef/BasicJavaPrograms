//creating sub-class for TwoWheeler as Bike
package com.assignment;

public class Bike extends TwoWheeler
{
	double mileage;//non-static global variable
	
	Bike()//no argument constructor
	{
		
	}
	
	Bike(String name,String color,double mileage) //parameterized constructor
	{
		super(name,color);//super call statement
		this.mileage = mileage;//assigning value
	}
	

}
