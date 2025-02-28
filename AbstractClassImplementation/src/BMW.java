/*
Extends: when a class want to inherit other class it uses extend keyword. 
here the class BMW is inheriting the call Car.

The inheritance has "Is a" relationship.

A single class can be inherited by many classes, i.e a Parent class can have many child classes, but opposite is not possible in Java.

example: see BMW and Audi classes, both inheriting the Car class

*/


public class BMW extends Car{
	
	public void maintain() {
		System.out.println("Inside BMW maintain");
	}
	
	@Override
	public void speed() {
		System.out.println("Inside BMW speed()");
	}

	@Override
	public void price() {
		System.out.println("Inside BMW price()");
		
	}
	
}
