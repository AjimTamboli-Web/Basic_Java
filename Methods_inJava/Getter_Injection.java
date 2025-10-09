package java_plane.Methods_inJava;

/*
 * Getter Injection is a way to provide values or dependencies to an object after it is created, but accessed through getter methods.
      - Unlike constructor injection, the object can be created first and values can be set later.
      - Getter injection usually works together with setter injection, because the getter just retrieves the value that was set.
 * Getter injection is basically about accessing values via getter methods rather than directly using the object’s fields. 
 * Object is created first, then values are injected (usually via setters).Getters are used to access these injected values.
 * Common in JavaBeans pattern where all properties are private, and accessed via getter/setter.	     
 */


public class Getter_Injection {

	public static void main(String[] args) {
		
		GetInj obj = new GetInj();
		
		// injecting values after creation 
		obj.setI(23);
		obj.setName("Judy");
		
		// accessing injected values via getters
		System.out.println(obj.getI() + "  " + obj.getName());

	}

}


class GetInj{
	// variables are private for no other class can be access directly
	private int i;
	private String name;
	
	// Constructor can be empty
	GetInj(){
		
	}
	
	// setter methods (Used to inject values)
	void setI(int i) {
		this.i = i;
	}
	void setName(String name) {
		this.name = name;
	}
	
	// getter methods (used to access values)
	int getI() {
		return i;
	}
	String getName() {
		return name;
	}
	
}
