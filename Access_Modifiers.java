package java_plane;
/*
 * Access Modifiers =>> It is a Keywords that define who can access classes,methods,variables and constructors in your code.
                      They are part of Encapsulation, which hides data and ensures controlled access.
 * The access modifiers in Java specify the accessibility or scope of a field, method, constructor, or class. 
     We can change the access level of fields, constructors, methods, and classes by applying the access modifier to them.   
        
     Modifier				  Applies To						     	 Accessibility
 *	private				Variables, methods, constructors	        Within the same class only
 *	default/package	    Classes, variables, methods, 		    Within the same package
    (no keyword)					constructors
 *	protected	        Variables, methods, constructors	        Same package + child classes 
															    (even in different packages)
 *	public		   Classes, variables, methods, constructors	     Accessible from anywhere       
 *         
 */
public class Access_Modifiers {

	public static void main(String[] args) {
		
		Access_Subclass sub = new Access_Subclass();
		
		//System.out.println(sub.w);   ❌Private - not accessible
		  System.out.println(sub.x); //☑️default- same package
		  System.out.println(sub.y); //☑️protected- same package
		  System.out.println(sub.z); //☑️public - everywhere

	}
                     // for better understanding look java_OOPs folder in Access_Modifier2.java file 
}


