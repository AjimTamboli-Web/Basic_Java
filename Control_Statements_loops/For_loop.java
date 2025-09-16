package java_plane.Control_Statements_loops;

public class For_loop {

	public static void main(String[] args) {
		// Used when the number of iterations is known.
		
		for(int i = 1;     //initialization of variable
				i < 6;     // Condition checks true or false
				i ++) {    // operation on variable increment/decrement.
			// Execution block of code 
			System.out.println("In For loop " + i);
		}
		
	System.out.println("*******************************");	
	
		// you can write also 
		int j;
		
		for(j= 1;j<5;) {    // but it does not recommended in java use syntax always
			System.out.println("Number: " + j);
			j++;
	      }
	
	System.out.println("*******************************");	
		
      // Odd numbers
		for(int k = 1; k < 10; k=k+2) { // only when you know the range otherwise use if else
			System.out.println( k );     // look below example
		}
			
	System.out.println("***********************");
	
	// Odd and Even Numbers
	
		for(int a=0;a<=10;a++) {
		
			if(a%2==0) {
				System.out.println("Even Number: " + a);
			}else {
				System.out.println("Odd Number: " + a);
			}
		}
		
	System.out.println("*******************************");
		
	 // sum numbers
		int sum = 0;
		for (j= 1;j<=10;j++) {
            sum = sum + j;
		   
		}
		System.out.println("Sum is : " + sum);

	System.out.println("*******************************");
		// Countdown
		
		for(int m =5; m >= 1; m--) {
			System.out.println(m);
		}
		
	
		
	System.out.println("***********************");
		
		// star increasing
		for(int i= 1;i <5;i++) {
			for(int n=1;n<i;n++) {
				System.out.print("*");  // fill in column one by one data
			}
			System.out.println();   // for get new row to add
			
		}
		
	}

}
