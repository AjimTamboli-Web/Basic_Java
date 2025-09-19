package java_plane.Conditional_Statements;

import java.util.Scanner;

public class Switch_case_state {

	public static void main(String[] args) {
		
/*
* switch: Selects one block from multiple options based on a variable’s value.
    In simple words, the Java switch statement executes one statement from multiple conditions.
  * The expression can be of type byte, short, char, int, long, enums, String, or wrapper classes (Integer, Short, Byte, Long).
  * It start on variable name and working on variable values.
  * it work on same data type in cases.
  * in switch case you can't use continue statements.	 
		 */
// Case values must be constants or literals and of the same type as the switch expression.		
		String day = "sdsa";
		switch(day) {
		case "Monday": {
			System.out.println("Today is monday.");
			break;    // The break statement is used to exit from the switch block.
		}
		case "Thuesday":{
			System.out.println("Today is Thuesday.");
			break;
		}
		case "Wednesday":{
			System.out.println("Today is Wednesday.");
			break;
		}
		case "Thusday":{
			System.out.println("Today is Thusday.");
			break;
		}
		case "Friday":{
			System.out.println("Today is Friday.");
			break;
		}
		case "Saturday":{
			System.out.println("Today is Saturday.");
			break;
		}
		case "Sunday":{
			System.out.println("Today is Sunday.");
			break;
		}
	// The default case is optional and executes if no case matches the switch expression. It can appear anywhere within the switch block.	
		default:{ 
			System.out.println("Select only days.");
		}
		}

		
// Calculating Area of circle,Area of Rectangle with the given length with using do while in continue or exit option.
		
		   //int select = 1;
      //  int choice = 1;
        int r,b,l;
        double pi = 3.14,area;
        char again;
        Scanner sc = new Scanner(System.in);
        do {
        
        System.out.println("1. Calculate Radius of Circle.   \n2. Calculate Area of Circle.");
        System.out.println("Enter the Choice: ");
        int select = sc.nextInt();
        
       
        switch(select){
            case 1: {   	
                System.out.println("Enter Radius of circle: ");
                r=sc.nextInt();
                area = pi*r*r;
                System.out.println("Area of Circle: " + area);
                break;
                }
            case 2: {
                System.out.println("Enter length and breadth for calculate area of rectangle:: ");
                System.out.println("Enter length: ");
                l=sc.nextInt();
                System.out.println("Enter Breadth: ");
                b = sc.nextInt();
                 area = l*b;
                 System.out.println("Area of rectangle is: " + area);
                 break;
              
            }
           
			
        }   
        System.out.println("Want Continue:(Y/N): ");
        again=sc.next().charAt(0);
        }
        while(again == 'Y' || again == 'y');
        sc.close();
		
	}

}
