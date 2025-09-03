package java_plane;

public class Type_Casting {

	public static void main(String[] args) {
		
		// Type casting is when you assign a value of one primitive data type to another type.
		//types --> Widening Casting and Narrowing Casting
		
		//*****  Widening Casting => (Automatically) - converting a smaller type to a larger type size.
		            //  byte -> short -> char -> int -> long -> float -> double
		
		int age = 34;
		double d = age;     // widening  int -> double
							
		System.out.println(age);
		System.out.println(d);     // is done automatically 
		
		//***** Narrowing Casting => (manually) -> converting a larger type to a smaller type size.
		         // double -> float -> long -> int -> char -> short -> byte

		double marks = 45.56;
		int m = (int) marks;      // narrowing double -> int 
		
		System.out.println(marks);
		System.out.println(m);       // is done manually and lost the data 
		
		// You can use the narrowing in banking where you get exact amount of debited like Gpay.
		
	}

}
