package java_plane.Methods_inJava;

/*
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


public class Intro_methods {

	public static void main(String[] args) {
		
		
		System.out.println(Math.random());    // Predefined Methods
		
		Meth obj = new Meth();         
		
		                     // User-defined Method
		obj.myMethod();                             // Instance Method
		
		Meth.proMeth();                   // Static Method
		
	}

}

class Meth{
	
	public void myMethod() {
		System.out.println("This is Method.");
		System.out.println("in Instance Method.");
	}
	
	
	public static void proMeth() {
		System.out.println("This is static Method.");
	}
	
}
