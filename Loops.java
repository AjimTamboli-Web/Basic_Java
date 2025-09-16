package java_plane;

public class Loops {

	public static void main(String[] args) {
		
  /* Loops are control statements in java that allows a block of code to be executed repeatedly as long as a specified condition is true.
	 They help in reducing code repetition.runs multiples time based on condition.
	 
	 There are four types of loops in java:
	 1> for:Used when the number of iterations is known.
	 2> while: used when the number of iteration is not known in advanced,condition checked before each iteration.
	 3> do-while: Similar to while loop,but condition is checked after executing the block(execute at least onece).
	 4> for-each: Used to iterate over arrays and collections.
	 
	 	
1)For loop :->
           used when we know how many times we want to repeat a task.
           the for statements includes the initialization,condition,and increment/decrement in one line.
           flow of loop is :(ICBO) Initialization of variable,Condition checks true/false,Block of code execution,Operation on variable increment/decrement.
           	 	
		 */
		 //     I      C     O       (ICBO)
		for(int i= 1; i<=5; i++) {
			System.out.println("For Loop" + i); //B
		}
		

		
	}

}
