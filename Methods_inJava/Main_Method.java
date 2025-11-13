package java_plane.Methods_inJava;

public class Main_Method {
   // valid methods
 //  static final synchronized strictfp public void main(String... ajim){
	static final void main(String [] args) {	
	   System.out.println("Valid main Method.");
	   
//	   public static void main(String[] args) {}
//	   static public void main(String  []args) {}
//	   final static public void main(String args[]) {}
//       static public final void main(String... args) {}
//       final static synchronized public void main(String  []args) {}
//         System.exit(0);   JVM Shutdown
	   
	}

}

class Child extends Main_Method {   // inheritance
	// if child does not contain main method then parent class main method will be executed
  
   // if child does have main method it is a method hiding but not a overriding  (it gives error)
	// it seems overriding concept applicable for main method but it is not a overriding and it is method hiding
   
	// Note: for main method inheritance and overloading concepts are applicable but overriding concept is not applicable
  // instead of overriding method hiding is applicable
	
}	