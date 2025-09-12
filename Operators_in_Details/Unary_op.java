package java_Operators;

public class Unary_op {

	public static void main(String[] args) {
		
		//Unary Operators :: +, -, ++, --, !
		// Unary Operators need only one operand.
		
		int as = +100;
		System.out.println("No is Positive : " + as);
		int yt = -as;
		System.out.println("No is Negative : " + yt);
		
		// ++ increment / -- decrement  => post and pre 
		
				int num = 5;		
				int b = ++num;     // Pre  => increase first :: first increases the value, then uses it.
				int c = num++;     // Post => increase later :: first uses the value, then increases it 
				System.out.println("Pre Increment  :: " + b);
				System.out.println("Post Increment :: " + c);
				
				int g = 45;
				int k = g--;       // post => decrease later :: first uses the value then decrease it.
				int l = --g;       // pre  => decrease first :: first decrease the value, then uses it. 
				System.out.println("Post Decrement  :: " + k);
				System.out.println("Pre Decrement :: " + l);
				
				int m = 4;
				m++;  //	 4	  post increment   
				++m;  //	 6	  pre increment
				--m;  // 5
				
				System.out.println(m);
				               //  5     6       6       6       6       5       3      3
				System.out.println(m + (++m) + (m++) + (--m) + (m--) + (m--) + (--m) - m);
				System.out.println(m);

    // (!) Not Operator :: This is used to convert true to false or vice versa.
				          //Basically, it reverses the logical state of an operand.
		  		
		  		int h = 10;
		  		int j = 200;
		  		System.out.println("H is less Than j::  " + (h<j));
		  		System.out.println("J is greter than H:: " + (j>h));
		  		System.out.println("H is less Than j::  " + !(h<j));  // Using !
		  		System.out.println("J is greter than H:: " + !(j>h)); // Using !
				
				
	}

}
