package java_plane.Methods_inJava;

/*
 *  this is a special keyword that refer to the current object , the object whose method or constructor is currently being executed.
 *  it use in Methods and Constructors. this work on objects only when you create a object this refer the particular object.
 *  You cannot use this inside method or static block, because this refers to an object  and static belongs to the class not object.
 *  
 *  Types of this  ==>>  this variable   ->  to refer the current class instance variables
 *                                       -> if the parameter and instance variable have the same name , this removes the confusion.
                                  
 *                       this.mathod    ->  to call current class method , we can call another method of the same class using this
 *                                      -> using this here is optional but useful when variable or method names are shadowed.
                                     
 *                       this()    -> to call current class constructor (Constructor chaining), call another constructor from one constructor.  
 *                       		   -> must be the first statement inside the constructor. You cannot use both this() and super() in the same constructor.
       
 *         ----(this)  ->  To pass current object as an argument.
                       ->  Sometimes we want to pass the current object to another method or constructor.
                                                
    						   
 */

public class ThisOperations {

	public static void main(String[] args) {

		Types ty = new Types();  // non parameterized constructors	
		ty.a = 45;
	    Types ty1 = new Types(23);  // Parameterized constructors
		 ty1.a = 67;
		Types ty2 = new Types(64,57); 	
		 ty2.a = 78;
		Types ty3 = new Types("Hello");
		 ty3.a=67;
		 
		 System.out.println("*********************");
		 
		 ThisKey jump = new ThisKey(45,76);   // Constructor Jumping
		 
	}

}


// A constructor has no parameters is known as  default constructors. A default constructor is invisible.
// if we write a constructor with no argument, the compile does not create a default constructor.

class Types {
	
	int a;
	int B;
	
	public Types() {                 // non parameterized constructors
		System.out.println("Non-parameter constructor.");
	}
	
	public Types(int a) {         // Parameterized constructors
		a = 345;
		System.out.println("Parameter constructors.");
	}
	
	public Types(int a,int b) {   // instance variable to local variable 
		// this keyword is a object.it should be mention in first line in constructors.
		 // this is variable  and  is known as variable call
		
		this.a = a;        // when you have same name variable to differentiate variable      
		B = b;             
		
		System.out.println("Using (this) keyword in constructor with variable.");
		System.out.println(a + " " + b);
	}
	
	public Types(String name) {
		System.out.println(name);
	}
	
}

  
//        output you want 4 -> 6 -> 2-> 1 -> 7 -> 5 -> 3   this is constructor jumping  initialize from last to first 
//             using this(); is called constructor chaining


class ThisKey{
	
	int s;
	
	public ThisKey(){
		this(2);
		System.out.println("One");
	   
	}
	
	public ThisKey(int a) {
		this("Dooom");
		System.out.println("Two");
	}
	
	public ThisKey(int a, int b) {
		this(34.6f);
		System.out.println("Three");
	}
	
	public ThisKey(double a) {
		
		System.out.println("Four");
	}
	
	public ThisKey(float f) {
		this('R');
		System.out.println("Five");
	}
	
	public ThisKey(String name) {
		this(34.79);
		System.out.println("Six");
	}
	
	public ThisKey(char d) {
		this();
		System.out.println("Seven");
	}
	
}







