package com.basics.pro;


 class Animal3
{  
	double height;
	double weight;
	void talk()
	{
		System.out.println("animal talks...");
	}

}
 class Dog3 extends Animal3
{
	void sniff()
	{
		System.out.println("Dog sniffs...");
	}

}
public class PetsInheri
{
	public static void main(String[] args) 
	{
        Dog3 d = new Dog3();
        d.height=23.3;//assigning value to the properties after object creation
        d.weight=33.3;
        System.out.println("weight="+d.weight);
        System.out.println("height="+d.height);
        d.sniff();
        d.talk();
	}
}
