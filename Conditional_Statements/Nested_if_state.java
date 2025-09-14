package java_plane.Conditional_Statements;

public class Nested_if_state {

	public static void main(String[] args) {
		
	/*  * A nested if is an if statement that is the target of another if or else. Nested if statements mean an if statement inside an if statement. 
	 	* If the outer condition is true the inner conditions are checked and executed accordingly.
	 	* Nested if checks conditions that depend on each other, which means one condition is only checked if another condition is true.
	 	* If the outer condition satisfies then only the inner condition will be checked. Along with if condition, else condition can also be executed.
	 */

       int no = 10;
       
       if(no > 0) {
    	   if(no > 10) {
    		   if( no > 18) {
    			   if(no > 100) {
    				   System.out.println("Allowed to vote in wheel chair");
    			   }else {
    				   System.out.println("You can vote.");
    			     }
    		   } else {
    			   System.out.println("You are a teen.");
    		     }
    	   } else {
    		   System.out.println("Your a child.");
    	   }
       }	
	}
}
