package java_plane.Conditional_Statements;

public class If_else_state {

	public static void main(String[] args) {
		
		
	/*	The else statement lets you run a block of code when the condition in the if statement is false.
  	 *	else does not have a condition - it runs when the if condition is false.
	 *  It executes one block of code if a condition is true and another block if the condition is false.	
				*/
		
		int code = 2426;
		
		if(code == 2426) {
			System.out.println("Door is Open");
		  }
		   else {
			 System.out.println("Door is Lock.");
		    }
		
		System.out.println("*********************");
		
		
		boolean lightOn = true;
		
		if(lightOn) {
			System.out.println("Light is on");
		}
		 else {
			 System.out.println("Light is Off");
		 }
		
		System.out.println("****************************");
		

		String abc = "Abc@4345";
		System.out.println("Enter a Password :: ");

		String pass = "Abc@4345";
		
		if(pass == abc) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Password is Wrong");
		}
		
		
	}

}
