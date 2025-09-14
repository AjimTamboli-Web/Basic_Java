package java_plane.Conditional_Statements;

public class If_state {

	public static void main(String[] args) {
		/* Every if statement needs a condition that results in true or false.
			This means if statements work hand-in-hand with boolean values:
		The Java if statement is the most simple decision-making statement. 
		It is used to decide whether a certain statement or block of statements will be executed or not.
		i.e. if a certain condition is true then a block of statements is executed otherwise not.
				
		Most often, conditions are created using comparison operators, like the ones below:
								Less than: a < b
								Less than or equal to: a <= b
								Greater than: a > b
								Greater than or equal to: a >= b
								Equal to: a == b
								Not equal to: a != b
You can use these conditions to perform different actions for different decisions.		
				*/
		
		// using if statement
	  int i =34;
	  
	  if(i<50) // i less than 50
		  System.out.println("i is less than 50");
	  
	   System.out.println("This will also print");
		
	   
	   // if block
	   int j = 20;
	   if(j<30) //if execute condition is true
	   {    
		   System.out.println("j less than 30");
		   j++;
		   System.out.println("its define a range");
	   }
	   
	   // executed by default
	   		System.out.println(" j = " + j);
	  
	   		
	
	}

}
