//Assignment:
//1)WAP to show method overriding.
package com.basics.pro;



class Animal {
	public void talk()
	{
		System.out.println("Animals talk");//overridden method
	}

}

class Dog extends Animal{
	public void talk()
	{
		System.out.println("Dog barks");  //method overriding
	}

}
public class MthdOverriding {
		public static void main(String[] args) {
			Dog ob=new Dog();//creating object of subclass B
			ob.talk();   //method overridden
			
			
			
		}

}
