package java_plane;

/* You cannot create a literal value of StringBuilder. SCP won't we use here.
 * StringBuilder is a mutable (changeable) sequence of characters. It’s part of the java.lang package — so no need to import it.
 * Unlike String (which is immutable), StringBuilder lets you change the text in the same object, which makes it faster and memory-efficient for modifications.
 * Why use? --> Mutable, memory efficiency is more, speed is much faster,methods are non-synchronized(not thread safe).
 * Methods-> append,insert,replace,delete,reverse,length,capacity,toString,setCharAt.
 * Length = actual number of characters.
 * Capacity = total available space before it has to grow.  default capacity 16
 * when the content grows, capacity automatically increases (usually old * 2 + 2)
 * Useful in -> loops, string concatenation, text building and performance-critical apps.
 */

public class String_Builders {

	public static void main(String[] args) {

	
		
		StringBuilder sb = new StringBuilder("Welcome to ");
		     sb.append("Java World");  // content of sb changed --- no new object was created.
		  
         String str = sb.toString();   // convert to String
         System.out.println(str);
         
         StringBuilder sb2 = new StringBuilder(str);  // convert String to StringBuilder
         System.out.println(sb2);
	}

}
