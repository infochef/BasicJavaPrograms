//creating sub-class of Vehicle as TwoWheeler
package com.assignment;

public class TwoWheeler extends Vehical
{
     String color;
     TwoWheeler()
     {
    	 
     }

	public TwoWheeler(String name,String color) //parameterized constructor
	{
		super(name);//super call statement
		this.color = color;//assigning value
	}
     
}
