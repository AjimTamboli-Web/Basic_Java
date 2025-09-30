package java_plane;

/* A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method.
 *	Methods are used to perform certain actions, and they are also known as functions.
 *	Why use methods? ->  To reuse code: define the code once, and use it many times.
 *	All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects.
 *	A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
*/	

public class Java_Methods {

	             // method
	public void myMethod() {    
		//code to be executed
		System.out.println("I just got Executed!");
	}
	
	
	public static void main(String[] args) {
		
	// create an instance of the method class	or create object of the class
		Java_Methods obj = new Java_Methods();
		
		// Calling the method
		 obj.myMethod();
		 obj.myMethod();
	
		
		
		
		

	}

}


