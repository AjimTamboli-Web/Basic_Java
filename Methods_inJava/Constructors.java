package java_plane.Methods_inJava;


/*   Special kind of methods, there is no return type in constructors.
 *   Constructors play an important role in object creation.
 *   A constructors is a special block of code that is called when an object is created. job is initialized object.
 *   to setup its internal state, to assign default values to its attributes.
 *   This process happens automatically when we use the "new" keyword to create an object.
 *   characteristics:: Same name as a class, No return type, Automatically called on object creation, Used to set initial values for object attributes.
 *   A constructor in Java can not be abstract, final, static, or Synchronized.
 *   Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
 *   Constructors can also take parameters, which is used to initialize attributes.
 *   Types of constructors =>> a> default constructors 
    						   b> parameterized constructors 
    						   c> copy constructors
    
 */

public class Constructors {

	public static void main(String[] args) {
		
	
		Const cons = new Const();   // constructors create by default when object is created.  A default constructor is invisible.
		
		cons.a= 123;
		
		
		Const con1 = new Const(32);  // parameterized constructors and int in parameter is passing
		
			con1.name= "Hello";	

	}

}

class Const {
	
	int a = 34;
	String name = "Hii";
	
	public Const() {
		System.out.println("Hello 1");
		// Assume default constructors when you don't mention . A default constructor is invisible.
		display();
	}
	
	
	public void display() {
		System.out.println("this is method and executing in constructor. ");
	}
	
	public Const(int a) {             // parameterized constructors
		System.out.println("Hello 2");
		a = 34;
		
	}
	
	
	
}
