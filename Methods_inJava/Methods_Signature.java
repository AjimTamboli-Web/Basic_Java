package java_plane.Methods_inJava;

/*
 * It consists of the method name and a parameter list. -> 1> Number of parameters 2> Type of parameters 3> Order of the parameters (sequence)
 * Method names should be unique within a class unless method overloading is allowed in Java.
 * 
 */

public class Methods_Signature {

	public static void main(String[] args) {
		
		Sign cal = new Sign();
		
	      int a =	Sign.add(342, 76);
		
		   int g=   cal.add(23, 7, 6);
		
	      System.out.println(a + " " + g);
	      
	      
	   // when you give two int and one double it get double and give three int it give int result 
	      cal.add(23, 543, 343.9);   // sequence   
	      //      int int  double
	      cal.add(23, 45, 56);      // No of parameters 
	      //     int  int int
	      
	}

}     //  Multiple methods can have the same name as long as the number and/or type of parameters are different.


class Sign{
	
	public static int add(int a , int b) {
		return a + b;
	}
	
	 public int mul(int a, int b) {
		return a *b;
	}
	
	public int add(int a, int b, int c) {         // method Overloading    Number of parameters
		return a+b+c;
	}
	
	public void add(int a, int b, double c) {       // Order of the parameters
		double z = a+b+c;
	   System.out.println(z);
	}
	
	
}