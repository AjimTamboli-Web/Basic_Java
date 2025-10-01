package java_plane;

/*
 * A variables is like a container(memory location) used to store data, it has a name,data type and a value.
 * Variable type : instance , local , static
 * Instance variable -> Declare inside class but outside methods\constructor\block, it specific to objects.
                     -  Belongs to an object (Instance) of the class.
                     -  Each object has its own copy of instance variables.
                     -  Stored in heap memory (since they are part of the objects).
                     -  it has a default values.assigned automatically 0 for int, null for objects, false for boolean.
                     -  scope is whole class, access in anywhere in whole class.
 * local variable -> Declare inside methods/ constructor/ blocks and used only there.
                  -  it does not have default value, must be initialized before use.
                  -  it can access only in method itself.
                  -  Stored in stack memory. 
                  -  Exist only during the execution of that method.             
 * static variable -> Declare with static keyword, shared across all objects.
                   -  Belongs to the class, not to any object.
                   -  All objects share one copy of a static variable.
                   -  Stored in Method area (class area) of memory.
                   -  Can be accessed using class name or object name.
 */


public class Variables {

	public static void main(String[] args) {
		
	Var obj = new Var();    // created object (instance) for Var class
	
		obj.age = 34;
		obj.name = "Tom";
		obj.company = "Wipro";
		Var.company = "TCS";
		Var.company = "Infosys";
		obj.myMethod();
		obj.myMeth();
		obj.myMeth();
		
			Var obj2 = new Var();
			obj2.age = 45;
			obj2.name = "Bob";
			Var.company = "Cognizant";
			Var.company = "Mahindra";
			obj2.myMethod();
			
			Var.myMeth();
	
            System.out.println("This is instance variables." + obj.age);
	}

}

class Var{
	
	int age;                // instance variable
	String name;            // instance variable
	static String company;  // static variable
	
	public void myMethod() {        // instance method
		
		int id = 10;               // local variable
		
		System.out.println("This is local variable." + id);
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(company);
	}
	
	public static void myMeth() {       // static method
		char division = 'A';            // local variable
		
		System.out.println("This is static method. " + division);
		
		
	}
	
}
