//This program is an example for Polymorphism.

package com.basics.pro;

class Vehicle
{
	String name;
	double mileage;
	
	public  Vehicle()     //constructor overloading
	{
		
	}
		
	public Vehicle(String name, double mileage) 
	{
		this.name = name;//assigning value
		this.mileage = mileage;//assigning value
	}
	public void move() //method overloading
	{
		System.out.println("Vehicle is moving....");
	}
	public void move(String loc)
	{
		System.out.println("vehicle is moving to "+loc);
	}
} 
class Car extends Vehicle
{     
	String type;
	public Car()//constructor overloading
	{
		
		
	}
	public Car(String name, double mileage,String type) {
		super(name, mileage);//calling super class constructor
		
		this.type=type;//assigning value
	}
	public void move()//method overriding
	{
		System.out.println(type+"Car is moving..");
	}
}
class BMW extends Car
{
    public BMW()//constructor overloading
    {
   	 
    }
    public BMW(String name, double mileage,String type)
    {
		super(name, mileage,type);//calling super class constructor
		
	}
    public void move(String loc)//method overriding
    {
   	 System.out.println("BMW of "+type+" is moving towards "+loc);
    }
    

}

public class MyDriver1
{
	public static void main(String[] args)
	{
     Vehicle v[]=new Vehicle[5];		//creating non-primitive array
     v[0]=new Vehicle("Train",50.0);     //creating Vehicle's object
     v[1]=new Car("Toyota",35,"sedan"); //creating Car's object
     v[2]=new Car("Audi",40,"luxury"); //creating Car's object
     v[3]=new BMW("X3",45,"luxury");  //creating BMW's object
     v[4]=new BMW("M3",44.0,"luxury");//creating BMW's object
         for(int i=0;i<v.length;i++)
         {
        	 System.out.println("name is "+v[i].name);
        	 System.out.println("mileage is "+v[i].mileage);
        	 if(v[i] instanceof Car)//To check whether the object contains instance of given class
        		 System.out.println("type is "+((Car)v[i]).type);
        	 v[i].move();		 //methods
        	 v[i].move("London");//methods
             System.out.println("#############"); 
         }

	}


}
