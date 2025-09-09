package java_Operators;

public class Arithmetic_op {

	public static void main(String[] args) {
		
     // Arithmetic operators => +,-,*,/,%,++,--
		// it use to do operations on value or variable.
		int a = 12;
		int v = 5;
		System.out.println(" Addition of ::  "+a+v);
		System.out.println(" Sub of :: " + (a-v));
		System.out.println(" Mul is :: " + a*v);
		System.out.println("Div is :: " + (a/v) + " \nModulus is ::  " + (a%v));
		
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
		
		
		
	}

}
