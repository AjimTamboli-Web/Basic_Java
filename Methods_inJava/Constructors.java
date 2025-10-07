package java_plane.Methods_inJava;

/*
 *   Constructors play an important role in object creation.
 *   A constructors is a special block of code that is called when an object is created. job is initialized object.
 *   to setup its internal state, to assign default values to its attributes.
 *   This process happens automatically when we use the "new" keyword to create an object.
 *   characteristics:: Same name as a class, No return type, Automatically called on object creation, Used to set initial values for object attributes.
 *   A constructor in Java can not be abstract, final, static, or Synchronized.
 *   Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
 *   Constructors can also take parameters, which is used to initialize attributes.
 *   Types of constructors =>> a> default constructors b> parameterized constructors c> copy constructors
 *   
 */

public class Constructors {

	public static void main(String[] args) {
	
		Con cons = new Con();   // constructors create by default when object is created.
		
		cons.a = 344;
		System.out.println("Hello" + cons);
		
		Con con1 = new Con(32);  // parameterized constructors and int is parameter is passing
		
		con1.a = 432;
		System.out.println(con1);
		
		cons.add(23);
		
		
		cons.equals(con1);
	}

}

class Con {
	
	int a = 34;
	
	public Con() {
		System.out.println("Hello");
		// Assume default constructors when you don't mention
	}
	
	public Con(int a) {             // parameterized constructors
		System.out.println("Hello");
		a = 34;
		
	}
	
	public static void add(int... x) {
		System.out.println("Var-arg method");
	}
	
}
