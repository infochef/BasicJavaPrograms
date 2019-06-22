//Assignment
//WAP for Is-A relationship between Vehicle, two-wheeler,Bike
package com.basics.pro;

class Vehicle2 {
	String name;
	static  int count;
	String vno;
	Vehicle2()
	{
		count++;		//increment
		vno="KA "+count;//assigning value
		
	}
	Vehicle2(String name)
	{
		this();
		this.name=name;//assigning value
	}

}
class TwoWheelerr extends Vehicle2{
	String color;
	TwoWheelerr(String name,String color)
	{
		super(name);			//calling super class constructor
		this.color=color;		//assigning value
	}

}

class Bike2 extends TwoWheelerr{
	double mileage;
	
	Bike2(String name,String color,double milage)
	{
		super(name,color);		//calling super class constructor
		this.mileage=milage;		//assigning value
	}

}

public class VehicleInheri
{
	public static void main(String[] args) {
		Bike2 ob1=new Bike2("Avenger","Blue",45.5);    //creating Bike object
		TwoWheelerr ob2=new TwoWheelerr("Duke","red"); //creating TwoWheeler object
		Vehicle2 ob3=new Vehicle2("Train");			 //creating vehicle object
		
		System.out.println("vname="+ob1.name);
		System.out.println("vno="+ob1.vno);
		System.out.println("Vehicle color="+ob1.color);
		System.out.println("Vehicle milage="+ob1.mileage);
		System.out.println("---------------------------------");	
	
	
		System.out.println("vname="+ob2.name);
		System.out.println("vno="+ob2.vno);
		System.out.println("Vehicle color="+ob2.color);
		System.out.println("---------------------------------");	
			
		System.out.println("vname="+ob3.name);
		System.out.println("vno="+ob3.vno);
		System.out.println("---------------------------------");	

}
}