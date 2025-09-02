package java_plane;

public class DataType_Primitive {

	public static void main(String[] args) {
		
		// Primitive data types :: Basic data types already define by java, fixed sizes.They are not objects.
		// They stored actual values (like numbers, characters, true/false ) , they do not have methods.
		
		// byte, short, int, long, float, double, char, boolean
		
		// Formula ::  -2^n-1  to  2^n-1-1    (n means number of bits)   1 byte = 8 bits
		
		byte x = 127;  // 1 byte size
		// -2^8-1 to 2^8-1-1
		//  -2^7 to 2^7-1
		//  -128 to 127  it does not get the higher number than size
		System.out.println(x);

		short y = 32767;    // 2 bytes = 16 bits
		// -2^16-1 to 2^16-1-1
	    //  -2^15 to 2^15-1
		// -32,768 to 32,767  // not higher than size
		System.out.println(y);
		
		int z = 2145345879;    // 4 bytes = 32 bits
		// -2^8-1 to 2^8-1-1
	    //  -2^32 to 2^32-1
		// -2,147,483,648 to 2,147,483,647
		System.out.println(z);
		
		long a = 9223372036854775807L;      // 8 bytes = 64 bits   // end with L  
		// -2^8-1 to 2^8-1-1
	    //  -2^63 to 2^63-1
		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		System.out.println(a);
		
		float b = 342.3452f;      // 4 bytes = 32 bits   
		//
	    //  you should end the value with an "f"
		// Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		System.out.println(b);
		
		double c = 23123.54654657d;    // 8 bytes = 64 bits  
		//
		// you should end the value with an "d" for doubles
		// Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
		System.out.println(c);
		
		char o = 67,   // 2 bytes = 16 bits
		   p = '@';
		// if you are familiar with ASCII values, you can use those to display certain characters 0 = 65(A), r=66(B)
		// Stores a single character/letter or ASCII values
		// The character must be surrounded by single quotes, like 'A' or 'c' 
		System.out.println(o + " " + p);
		   
		boolean isFun = true;    // 1 bit
		//  Stores true or false values
		System.out.println(isFun);
	}
 
}
