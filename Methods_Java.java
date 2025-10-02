package java_plane;

/* A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method.
 *	Methods are used to perform certain actions, and they are also known as functions.
 *	Why use methods? ->  To reuse code: define the code once, and use it many times.
 *	All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects.
 *	A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
 *  Method names must start with a verb in lower case. Multi-word names should follow camelCase format.
  
 * Types of methods -> Predefined Method and User defined Method
 * 1> Predefined method - Predefined methods are the method that is already defined in the Java class libraries.
                        - It is also known as the standard library method or built-in method.
                              Ex. Math.PI, System.out.println
 * 2>User-defined Method- The method is written by the user or programmer is known as a user-defined method.
                        - These methods are modified according to the requirement.
                              Ex. myMethod, Greet, setName
         --> different ways to create java method  
					         1> instance method - Access the instance data using the object name. Declared inside a class. 
					         2> static method   - Access the static data using the class name. Declared inside class with static keyword.                                                           

*/	               

public class Methods_Java {	
	
	public static void main(String[] args) {
		
		System.out.println("Random No: " + Math.random());      // Predefined Method
		
		
	// create an instance of the method class	or create object of the class
		Meth obj = new Meth();
		
		// Calling the method
		 obj.myMethod();                   // instance method  - need object to run
		
	     Meth.nextMeth();                // static method   - work with class directly

	}

}


class Meth{
	   	 
	public void myMethod() {    //instance method
		
		System.out.println("I just got Executed!");
  }
	 
	public static void nextMeth() {    // static method
		
		System.out.println("This is Static Method.");
		
	}

}
