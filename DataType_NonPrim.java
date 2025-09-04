package java_plane;

public class DataType_NonPrim {
	
 public static void main(String[] args) {
		      
 // Non-primitive data types:: Non-primitive data types are called reference types because they refer to objects.
//  They do not store the value directly, but a reference (address) to the value/object in memory.
// Can be created by the programmer , sized is Not fixed (depends on object size)	 
	 // It can accept null value.
	 //  String, Arrays, Classes, Interfaces, Objects
	 
	 String name = "John Snow";          // String (sequence of characters)
	 
	 int[] arr = {34, 54, 76, 78, 98};     // Array (collection of integers)
	 
	 System.out.println(name +" " + name.toUpperCase());  // Has methods
	 
	 System.out.println(arr[3]);
	 
	 // Arrays  --> Collection of similar data type, also linear data structure.
	 
	 int[] marks = new int[5];         // created object(new keyword)for array
	// it size of 5 but it start with 0 index
   // indexes   values	 
	 marks[0] = 54;
	 marks[1] = 76;
	 marks[2] = 87;
	 marks[3] = 98;
	 marks[4] = 12;
	 System.out.println(marks.length); // display the length
	 
	 
	 String add = "pune";
	 System.out.println(12+12+add+3+4+10); // JVM work left to right
	 // when it countered the string it get concatenate the other values or num.
	}


}
