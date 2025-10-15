package java_plane.Strings_types;

/*
 * String Constant Pool (SCP) is a special memory area in the Java heap that stores only one copy of each string literal.
 * The String Constant Pool is a special memory area inside the Java Heap where all string literals are stored.
 * Both s1 and s2 point to the same object in SCP.
 * new String() creates new object in strings.
 * How SCP works internally -->>  When you write a string literal, JVM checks SCP.
								  If the literal exists → reuse reference.
								  If not → create a new object in SCP.
								  String literals are loaded when class loads (or when needed).
 * intern() is used to put a string object into SCP or get the SCP reference of an existing string.
 * intern() allows adding or getting string from the pool.
 * SCP is a special memory inside heap to store unique string literals.It helps save memory by reusing strings.
 * String immutability is the reason SCP works safely.
 * SCP works properly because String is immutable → it never changes, so multiple variables can safely point to the same object.						  
 */

public class SCP_String_Constant_Pool {

	public static void main(String[] args) {
		
		String s1 = " Hello"; // String literals
		String s2 = "Hello";
		
		System.out.println(s1 == s2);    // Same reference
		System.out.println(s1.equals(s2)); // same value
	System.out.println("*************************************************");	
		String s3 = new String("Hello"); // create new object in heap memory (Not SCP)
		
		System.out.println(s1==s3);  // different reference
		System.out.println(s1.equals(s3)); // same content
		
	System.out.println("***********************************************");
	
		String str = new String("World");   // new object
		// get the reference of "World" from SCP
		String str1 = str.intern();  // put a string object into SCP 
		String str2 = "World";     // SCP object  / literal
		
		System.out.println(str == str1);  // heap vs SCP
		System.out.println(str1 == str2);  // Both SCP
	    
		
	}

}
