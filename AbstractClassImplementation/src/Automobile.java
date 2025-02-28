/*
 Interface: just provide a structure to the system.
 
 It contains only function and variable declarations, and not actual body of the function that means,
 it does not implement the functions.
 
 Interfaces can be implemented by different classes. And each class that implements this Interface must define/implement all the functions
 from the interface unless it is an abstract class.
 
 Abstract class implementing this interface can define all are few of the functions from the Interface.
 
 See Abstract class Car.java
 
*/

public interface Automobile {
	public void speed();
	public void maintain();
	public void refuel();
	public void price();
}
