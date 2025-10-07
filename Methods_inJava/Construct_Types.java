package java_plane.Methods_inJava;

public class Construct_Types {

	public static void main(String[] args) {

		Types ty = new Types();  // non parameterized constructors
		
			
		
		 Types ty1 = new Types(23);  // Parameterized constructors
		 
		 	ty1.a = 34776;
	}

}


// A constructor has no parameters is known as  default constructors. A default constructor is invisible.
// if we write a constructor with no argument, the compile does not create a default constructor.

class Types{
	
	int a;
	
	public Types() {                 // non parameterized constructors
		System.out.println("Hello");
	}
	
	public Types(int a) {         // Parameterized constructors
		a = 345;
		System.out.println(a);
	}
	
	public Types(int a,int b) {   // instance variable to local variable 
		this.a = a;
		System.out.println(a);
		
	}
	
}