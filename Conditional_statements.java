package java_plane;

public class Conditional_statements {

	public static void main(String[] args) {
		
	/* * Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.	
	   * Every if statement needs a condition that results in true or false. if statements work hand-in-hand with boolean values.
	   * Most often, conditions are created using comparison operators, like the ones below: # Less than: a < b
																							 # Less than or equal to: a <= b
	*  Java has the following conditional statements:										 # Greater than: a > b
	Use (if) to specify a block of code to be executed, if a specified condition is true.	 # Greater than or equal to: a >= b
	Use (else) to specify a block of code to be executed, if the same condition is false.	 # Equal to: a == b
	Use (else-if) to specify a new condition to test, if the first condition is false.		 # Not equal to: a != b
	Use (Nested-if) to specify If the outer condition is true the inner conditions are checked and executed accordingly.
	Use (switch) to specify many alternative blocks of code to be executed.
		
	*	Decision-making (or control statements) are used to execute different blocks of code based on certain conditions. 
	*	They allow a Java program to choose a path of execution depending on whether a condition is true or false.
		
		*/
		
		// if statements::
		
		int num = -9;
		
		// if: checks if a number is positive.
		if(num > 0) {    // num is greater than zero
			System.out.println("The number is positive.");
		}
			
		// if-else statements::
		// if-else: checks if the number is even or odd.
		
		if(num % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		
		// if-else-if ladder
		// if-else-if: checks whether the number is negative, zero, or positive.
		
		if(num < 0 ) {
			System.out.println("Number is negative");
		}
		else if(num == 0) {
			System.out.println("The number is zero");
		}
		else {
			System.out.println("Number is positive.");
		}
		
		System.out.println("*************");
		
		// Nested if
		// Nested if checks whether the number is negative, positive, even, odd.
		if(num > 0 ) {
			System.out.println("Number is Positive.");
			if(num % 2 == 0) {
				System.out.println("Number is even.");
			}else {
				System.out.println("Number is odd.");
			}
		}else
		   {
			System.out.println("Number is Negative.");
		   }

		
		// Switch case
		//switch-case: prints the day of the week based on the value of day.
		
		int day = 3;
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
	        break;	
		case 3:
			System.out.println("Wednesday");
		    break;
		default:
			System.out.println("Other day");
		}
		
	}

}
