package java_plane.Conditional_Statements;

public class If_else_if_ladder {

	public static void main(String[] args) {
		
	/*
	 *  if-else if-else: Tests multiple conditions sequentially.
	 *  Use the else if statement to specify a new condition if the first condition is false.
	 *  A user can decide among multiple options.The if statements are executed from the top down.
	 *  As soon as one of the conditions controlling the if is true, the statement associated with that 'if' is executed, and the rest of the ladder is bypassed. 
	 *  If none of the conditions is true, then the final else statement will be executed. If none of the conditions is true, then the final else statement will be executed.
	 *  There can be as many as 'else if' blocks associated with one 'if' block but only one 'else' block is allowed with one 'if' block.  
	 */
          double amount = 63997;
		
		if(amount > 0 && amount <= 10_000) {
			System.out.println("Low worth individual.");
		} 
		else if(amount > 10_000 && amount <= 30_000) {
			System.out.println("Medium worth individual.");
		} 
		else if(amount > 30_000 && amount < 50_000) {
			System.out.println("High worth individual.");
		} 
		else if(amount > 50_000 && amount < 10_0000) {
			System.out.println("Ultra high individual.");
		} 
		else {
			System.out.println("Work hard.");
		}
		
			
			
			
			
			
			
			
			
			
			
	}

}
