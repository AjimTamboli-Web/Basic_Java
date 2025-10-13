package java_plane;

/*
 * The String Constant Pool is a special memory area inside the Java Heap where all string literals are stored.
 * Both s1 and s2 point to the same object in SCP.
 * new String() creates new object in strings.
 * How SCP works internally -->>  When you write a string literal, JVM checks SCP.
								  If the literal exists → reuse reference.
								  If not → create a new object in SCP.
								  String literals are loaded when class loads (or when needed).
 * intern() is used to put a string object into SCP or get the SCP reference of an existing string						  
 */

public class SCP_String_Constant_Pool {

	public static void main(String[] args) {
		
		String s1 = "Hello"; // String literals
		String s2 = "Hello";
		
		System.out.println(s1 == s2);    // Same reference
		System.out.println(s1.equals(s2)); // same value
		
		String s3 = new String("Hello"); // create new object in heap memory (Not SCP)
		
		System.out.println(s1==s3);  // different reference
		System.out.println(s1.equals(s3)); // same content
		
	}

}
