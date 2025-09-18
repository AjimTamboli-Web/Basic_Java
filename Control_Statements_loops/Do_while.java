package java_plane.Control_Statements_loops;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// Similar to while loop, but condition is checked after executing the block (executes at least once). 
		
		int i = 0;
		do {
			System.out.println("Condition is process.");
			i++;
		}
		while(i<5);

	// Armstrong Number
		int num= 1,temp = num,sum =0;
		do {
			int digit = temp % 10;
			sum += digit * digit * digit;
			temp /= 10;
		}while(temp > 0);
		
		if(num == sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
		
    // User Input Until Exit
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Say Hello \n2. Say Bye \n3. Exit");
			choice = sc.nextInt();
			
			if(choice == 1) System.out.println("Helloooo");
			else if(choice == 2) System.out.println("Byyyeee");
		}while(choice != 3);
		
		sc.close();
	}

}
