//This is an example for downcasting 
package com.basics.pro;

import com.assignment.Bike;

public class MainClass6 {
	public static void display(Vehical v)
	{
		System.out.println("Vehical Name="+v.name);
		System.out.println("Vehical No="+v.vno);
		if(v instanceof TwoWheeler)
			System.out.println("Vehical color="+((TwoWheeler)v).color);
		if(v instanceof Bike)
		System.out.println("Vehical mileage="+((Bike)v).mileage);
		System.out.println("###########################################");

		

	}

	public static void main(String[] args)
	{
		/*Bike b1=new Bike("Pulsar","Black",45.5);
		Bike b2=new Bike("Avenger","Blue",67.8);
		TwoWheeler b3=new TwoWheeler("a-1 cycle","green");
		Vehical b4=new Vehical("train");
		display(b1);
		display(b2);
		display(b3);
		display(b4);
*/
		
		/*Bike b1=new Bike("Pulsar","Black",45.5);
		Bike b2=new Bike("Avenger","Blue",67.8);
		TwoWheeler b3=new TwoWheeler("a-1 cycle","green");
		Vehical b4=new Vehical("train");
		Vehical v[]= {b1,b2,b3,b4};
		
			for(int i=0;i<v.length;i++) 
			{
			display(v[i]);*/
		
		Vehical[] v=new Vehical[4];
		
		v[0]=new Bike("Pulsar","Black",45.5);
		v[1]=new Bike("Avenger","Blue",67.8);
		v[2]=new TwoWheeler("a-1 cycle","green");
		v[3]=new Vehical("train");
		for(int i=0;i<v.length;i++) 
		{
		display(v[i]);
		
		
		}
	}
}


