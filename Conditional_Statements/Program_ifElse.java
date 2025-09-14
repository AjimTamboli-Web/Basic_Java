package java_plane.Conditional_Statements;

import java.util.Scanner;

public class Program_ifElse {

	public static void main(String[] args) {
				
		// This program for calculate % for salary to income tax like GST
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount : ");
		double amount = sc.nextDouble();
		
		
		if(amount > 0 && amount <= 4_00_000) {           // condition or range
			System.out.println("No need tax : NIL.");
		} 
		  else if(amount > 4_00_000 && amount <= 8_00_000) {
			double tax = (amount * 5) /100;
			System.out.println("Pay 5% tax of your amount:  " + tax);
		}  
		  else if(amount > 8_00_000 && amount <= 12_00_000) {
			double tax = ((amount * 10) / 100);
			System.out.println("Pay 10% tax of your amount: " + tax);
		} 
		  else if(amount > 12_00_000 && amount <= 16_00_000 ) {
			double tax = ((amount * 15) / 100);
			System.out.println("Pay 15% tax of your amount: " + tax);
		} 
		  else if(amount > 16_00_000 && amount <= 20_00_000) {
			double tax = ((amount * 20) / 100);
			System.out.println("Pay 20% tax of your amount: " + tax);
		} 
		  else if(amount > 20_00_000 && amount <= 24_00_000) {
			double tax = ((amount * 25) / 100);
			System.out.println("Pay 25% tax of your amount: " + tax );
		} 
		  else if(amount > 24_00_000) {
			double tax = ((amount * 30) / 100);
			System.out.println("Pay 30% of your amount: " + tax);
		} 
		  else {
			System.out.println("Wrong amount.Please check again.");
		}

		sc.close();
		
	}

}
