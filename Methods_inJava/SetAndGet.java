package java_plane.Methods_inJava;

/*
 * The (get) method returns the variable value, and the (set) method sets the value.
 * Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case.
 * Getter and Setter are methods used to protect your data and make your code more secure.
 * Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
 * 
 */

public class SetAndGet {

	public static void main(String[] args) {
		
		Meth2 m = new Meth2();
		
		m.setA(1234);   			 // for access private variable
		m.name = "John"; 			 // you can mention direct instance variable using object
		
		System.out.println(m.getA());
         System.out.println(m.name);
         m.display();
	}

}

class Meth2{
	private int a;    // variable is private, only access in this class
	String name;      // variable is default, access in anywhere
	
	public void display() {
		System.out.println("in display Method.");
	}
	
	public void setA(int a) {    // set the value
		this.a = a;
	}
	
	public int getA() {       // get the value
		return a;
	}
	
	
	
}




