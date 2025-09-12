package java_Operators;

public class Assignment_op {

	public static void main(String[] args) {
		/* Assignment Operators ::  =, +=, -=, *=, /=, %=
		                 => Are used to assign values to a variable.
		    * Two types = Simple assignment operator(=), Compound assignment operator(+,-,*,/)
		    * Assignment operators have right to left associativity, i.e., the value given on the right-hand side of the operator is assigned to the variable on the left. 
		       Therefore, the right-hand side value must be declared before using it or should be a constant.
            * Syntax :: variable operator value;
        
        */
		// 1. Simple assignment operator (=)
		
		// Declaring Variables
		int num; 
		String name;
		// Assigning Values
		num = 34;
		name = "Tom";
		
		System.out.println("num is assigned : " + num);
		System.out.println("name is assigned : " + name);
		
		/* 2. Compound assignment operator => is used where +,-,*,/,% is used along with the = operator.
		    *  It operates by adding the current value of the variable on the left to the value on the right 
		                    and then assigning the result to the operand on the left. 
		    *    a+= 10 This means, a = a + 10
		    *  Note: The compound assignment operator in Java performs implicit type casting.
		*/
		   int x = 5;
		  // x = x + 4.5;  it throw runtime error "incompatible type"
		     x += 3.5;   // Compound assignment operator += performs an implicit type conversion
		//   x = (int)(x + 4.5);             automatic narrowing primitive conversion from double to int
		   System.out.println(x); 
		   
		   int num1 = 54;
		   System.out.println(num1);
		   System.out.println("num1 += 5 :: " + (num1 += 5));
		   System.out.println("num1 -= 7 :: " + (num1 -= 7));
		   System.out.println("num1 *= 9 :: " + (num1 *= 9));
		   System.out.println("num1 /= 6 :: " + (num1 /= 6));
		   System.out.println("num1 %= 3 :: " + (num1 %=3));
		   
	}

}
