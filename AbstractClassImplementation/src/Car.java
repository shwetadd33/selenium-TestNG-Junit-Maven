/*
Abstract Class: Abstract class is an incomplete class . It can be extended by other class. The objects of an Abstract class can not be created
Abstract class can Implement an Interface
Abstract class can be useful when:
A class needs to implement Interface but does not want to define all the functions inside an Interface, since
when class is implements Interface it needs to define all the functions that are defined inside Interface.
So when class can not have all the function definitions within the interface it can be declared as Abstract as it provides a way 
for class to be incomplete.
*/

public abstract class Car implements Automobile {
	public void speed() {
		System.out.println("Inside Car class Speed");
	}
	
	public void refuel() {
		System.out.println("Inside Car class refuel");
	}
}
