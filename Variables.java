package java_plane;

/*
 * A variables is like a container(memory location) used to store data, it has a name,data type and a value.
 * Variable type : instance , local , static
 
 * Instance variable / object level variables / Attributes : 
 *               -> If the value of a variable is varied from Object to object such type of variables are called instance variables.
  					 -  Every object separate copy of instance variables will be created.
  					 -  Declare inside class but outside methods\constructor\block, it specific to objects.
                     -  Belongs to an object (Instance) of the class.
                     -  Each object has its own copy of instance variables.
                     -  Stored in heap memory (since they are part of the objects).
                     -  it has a default values.assigned automatically 0 for int, null for objects, false for boolean.
                     -  scope is whole class, access in anywhere in whole class.
                     -  we can't access instance variable directly from static area but we can access by using object reference,
                            but we can access instance variable directly from instance area. 
                     
 * local variable / temporary / stack / automatic variables  :
 				 ->	 Declare inside methods/ constructor/ blocks for temporary used and used only there.
                     -  JVM does not provide default value, must be initialized before use.at least default values.
                     -  it can access only in method itself.
                     -  Stored inside a stack memory.
                     -  Exist only during the execution of that method.
                     -  variables will be created while executing the block in which we declared it, once block execution is completes automatically local variable will be destroyed.
                     -  Scope of local variable is a block in which we declared it.
                     
                               
 * static variable / class level variables / Fields :
                 ->  Static variables should be declared with in the class directly but outside of any block / constructor / method.                   
                     -  Declare with static keyword, shared across all objects.
                     -  Belongs to the class, not to any object.
                     -  All objects share one copy of a static variable.
                     -  Stored in Method area (class area) of memory.
                     -  Can be accessed using class name or object name, but recommended to access class name.
                     -  Scope of static variable is exactly same as scope of .class file.
                     -  Access static variable directly from both instance and static areas.
                     -  JVM will provide default values and we are not required to perform initialization explicitly.
 */



public class Variables {

	public static void main(String[] args) {
		
	Var obj = new Var();    // created object (instance) for Var class
	
		obj.age = 34;
		obj.name = "Tom";
		
		Var.company = "TCS";
		Var.company = "Infosys";   // get only latest value    
		obj.myMethod();
	
		Var.myMeth();    // no need to call with object
		
			Var obj2 = new Var();
			obj2.age = 45;
			obj2.name = "Bob";
			Var.company = "Cognizant";
			Var.company = "Mahindra";        // work with class directly
			obj2.myMethod();
			
			Var.myMeth();        // directly work with class
	
            System.out.println("This is instance variables." + obj.age);
	}

}

class Var{
	
	int age;              									  // instance variable
	String name;        									   // instance variable
	
	static String company;  									// static variable
	
	public void myMethod() {        
		
		int id = 10;               // local variable
		
		System.out.println("This is local variable." + id);
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(company);
	}
	
	public static void myMeth() {       
		char division = 'A';            // local variable
		
		System.out.println("This is static method. " + division);
		
		
	}
	
}
