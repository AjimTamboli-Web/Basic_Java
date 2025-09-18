package java_plane.Control_Statements_loops;

public class While_loops {

	public static void main(String[] args) {
	/*	Uses when number of iterations is Unknown.
		Used when the number of iterations is not known in advance, condition checked before each iteration.
	    Also use for when we want to check the condition before executing the loop body
	    Also called Entry Control Loop	          */
		int i = 0;                //I
		while(i<10) {             //C
			System.out.println(i);//B
			i++;                  //O
		}
		System.out.println("******************************");
		
		//Factorial Number
		int num=5;
		int factorial = 1;
		int j = 1;
		
		while(j<=num) {
			factorial *=j;
			j++;
		}
		System.out.println("Factorial of: " + num + " is : " + factorial);
		System.out.println("************************************");
		
		// Countdown 5 to 1
		
		int h = 5;
		while(h>=1) {
			System.out.println(h);
			h--;
		}
		System.out.println("Blast Off");
		System.out.println("**********************************");
		
		//Break and Continue in While loop
		int r = 1;
		while(r<10) {
			if(r==5) {
				r++;
				continue;
			}
			System.out.println(r);
			r++;
		}
		System.out.println("************************************");
		
		//Print Reverse Number
		int d= 1234, rev= 0;
		while(d != 0) {
			int digit = d % 10;
			rev = rev * 10 + digit;
			d /= 10;
		}
		System.out.println("Reversed = " + rev);
		
	}

}
