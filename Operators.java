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
		
		
		
	}

}
