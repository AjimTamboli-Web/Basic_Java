package java_plane;

public class Operators {

	public static void main(String[] args) {
		
		/* Operators are used to perform operations on variables and values
		  Always add only two variable or value at a time.
		  

		   Java divided the operators into following groups::
			1) Arithmetic Operator   => 	+,-,*,/,%,++,-- 
			
	2) Relational/Comparison Operators =>    ==, !=, >, <, >=, <=          
	
			3) Assignment Operators  =>		=,+=,-=,*=,/=,%=,&=,|=,^=,>>=,<<=
			
			4) Logical Operators	 => 	&&,||,!
			
			5) Bitwise Operators	 => 	AND(&),OR(|),XOR(^),NOT(~),Left Shift(<<),Right Shift(>>)
			
			6) Ternary Operator      =>     condition ? value_if_true : value_if_false

	   			*/
		System.out.println("Its a binary operators."); 
		
// *1) Arithmetic operator :: it works on  mathematical operations.
		
		int a = 5, b = 8,z,x,y,w;
		 z = a+b;
		 x = a-b;
		 y = a*b;
		 w = a/b;
		float v = a%b;
		System.out.println("************ Arithmetic operators *********");
		System.out.println("Addition ::  " + z + "\nSubstraction is :: " + x + "\nMultiplication is :: " + y + "\nSubtraction is :: " + w + "\nModulus is :: " +v);
		 
		//increment and decrement =>  unary operators ++ and -- used to increase and decrease a value by 1. 
		// increment ++  :: pre and post 
		
		int num = 5;
		num++;  //5		 Post => increase later :: first uses the value, then increases it 
		++num;  //7	 	 Pre  => increase first :: first increases the value, then uses it.
		num++;  //7
		
	//                      8      8         10        10	
		System.out.println(num+ (num++) + (++num) + (num++));
		System.out.println(num); // 11
		
		// decrement --  :: pre and post
		
		int no = 12;
		no--;  //12		post => decrease later :: first uses the value then decrease it.
		--no;  //10		pre  => decrease first :: first decrease the value, then uses it.
		no--;  //10
	// 	                   9      8        8        7        5
		System.out.println(no + (--no) + (no--) + (no--) + (--no));
		System.out.println(no); // 5
		
//*2) Assignment Operator :: it used to assign a value to any variable.		
		
		int ab = 23; // = is a assignment operator to assign the value to a variable called ab.
		
		  ab += 5; // short-hand statement  ab = ab + 5; we can use many cases.
		  System.out.println(ab);
		
		int as = 4;
		System.out.println("***Assignment Operators***  " +as);
		System.out.println("as+=3 :: " + (as+=3));
		System.out.println("as-=2 :: " + (as-=2));
		System.out.println("as*=5 :: " + (as*=5));
		System.out.println("as/=4 :: " + (as/=4));
		System.out.println("as%=4 :: " + (as%=4));
		
//*3) Relational Operator :: used to checked for relations like equality,greater than and less than.
		//                     they return boolean results after the comparison
		int d =5, f =8, g = 5;
		System.out.println("***Relational Operators***");
		System.out.println("d > f : " + (d > f));
		System.out.println("f < g : " + (f < g));
		System.out.println("d <= g: " + (d <= g));
		System.out.println("f >= d: " + (f >= d));
		System.out.println("g == f: " + (g == f));
		System.out.println("f != d: " + (f != d));
		
/* *4) Logical Operator :: used to perform logical "AND", "OR", and "NOT" operations.
	  //used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration.
		                 *   AND Operator (&&): If( a && b ) [if true execute else don't]
		                 *   OR Operator (||): If( a || b) [if one of them is true to execute; else don't]
		                 *   NOT Operator (!): !(a<b) [returns false if a is smaller than b]                  */
		int e = 34, q = 21, r = 65;
	    boolean con1 = e>q, con2 = q>r;
	    System.out.println("Using AND Operator(&&) : " + (con1 && con2)); // Returns true if both statements are true
	    System.out.println("Using OR Operator(||) : " + (con2 || con1));  // Returns true if one of the statements is true
	    System.out.println("Using NOT Operator(!) : " + (!con2));  // Reverse the result, returns false if the result is true
	    
/* *5) Unary Operator :: Unary Operators need only one operand.  (+,-,++,--,!)
                        They are used to increment, decrement, or negate a value. 	    
		
		                                                 */
	}

}
