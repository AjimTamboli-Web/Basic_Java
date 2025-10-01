package java_plane;

/*
 * classes and objects are basic concepts of Object Oriented Programming (OOPs) that are used to represent real-world concepts and entities.
 * Class ->A class is a template to create objects having similar properties and behavior, or in other words, we can say that a class is a blueprint for objects.
 * Object -> An object is an instance of a class.  You can create multiple objects of one class:
 * 
 * 
 */


public class Class_Object {

	public static void main(String[] args) {
		
		Car Honda = new Car();	
		Honda.model="T20";
		
		Car Ferrari = new Car();
		Ferrari.model = "A7000";
		
		Honda.carRun();
		Ferrari.carStop();
	}
}


class Car{
	String model;
	String Name;
	double price;
	
	public String carRun() {
		String model = "Model: ";
		System.out.println("Car is running.......");
		return model;
	}
	
	void carStop() {
		System.out.println("Car is park in parking........");
	}
}