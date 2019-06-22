//This is super-class
package com.basics.pro;

public class Vehical
{
	String name;
	String vno;
	static int count;
	Vehical()
    {
    	count++;//increment
    	vno="KA "+count;
    }
    public Vehical(String name) {
		
		this.name = name;
		
    }
}