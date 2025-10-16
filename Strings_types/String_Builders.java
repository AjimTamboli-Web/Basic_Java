package java_plane.Strings_types;

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
         
     System.out.println("**********************************************");   
     
         String op1 = "abc";
         String op2 =  op1.concat("def");  // it use new keyword internally, does not change original value that's why it's immutable
         
         StringBuilder op3 = new StringBuilder(op1);  
         StringBuilder op4 = op3.append("def");   // change original value that's why it's mutable
                       
          
         System.out.println(op1);  // does not change original value
         System.out.println(op2);  // print in new string variable for concatenate 
         System.out.println("*************");
         System.out.println(op3);  // change value at line no 33
         System.out.println(op4);  // use the old variable value to concatenate without creating object
         System.out.println("*************");
         System.out.println(op1 == op2);   // different reference - string
         System.out.println(op3 == op4);   // same reference      - stringBuilder
         System.out.println("*************");
         System.out.println(op1.equals(op2));   // false - different values
         System.out.println(op3.equals(op4));   // true - same values
        
	}

}
