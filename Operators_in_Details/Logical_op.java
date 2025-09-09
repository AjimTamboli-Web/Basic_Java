package java_Operators;

public class Logical_op {

	public static void main(String[] args) {
/*  ** Logical Operator :: (&&, ||, !)  Used to perform logical "AND", "OR", and "NOT" operations.
	   Used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration.
	 *   AND Operator (&&): If( a && b ) [if true execute else don't]					*/
	    // Returns true if both statements are true		      
	     int a = 23;
	     int b = 45;
		 int c = 32;
		// using logical AND to verify	      
		 if(a>b && c++>a) {
			System.out.println("Condition is True");
			}
	       System.out.println("Condition is False and C is not increment" + c ); // c is not increment because it will check the first condition if false then it will not get second condition
			                
			                
			                
  //  *  OR Operator (||): If( a || b) [if one of them is true to execute; else don't]
	       // Returns true if one of the statements is true
	     // using logical OR to verify
	       if(c>b || a<b) {
	    	   System.out.println("Condion is True");
	       }else
	       System.out.println("Condition is False");
			     
			     
  //  *   NOT Operator (!): !(a<b) [returns false if a is smaller than b]                  
	       //Reverse the result, returns false if the result is true
			System.out.println(" A = " + a + "\n B = " + b + "\n C = " + c);
			
			       // Using logical NOT operator
			System.out.println("!A > B " + !(a<b));
			System.out.println("!B > C " + !(b<c));
		
		
	}

}
