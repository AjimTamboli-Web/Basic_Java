package java_plane;

public class Tasks {

	public static void main(String[] args) {

	     
	     Task.maxAndMin(456576167);
	}
}

class Task{
	 // Swap two Numbers Using + and - operator
	public static void swap(int No1,int No2) {
		int a = No1;
		int b = No2;
		System.out.println("Before Swap: " + a + " & " + b);
		a = a + b; 
		b = a - b;  
		a = a - b;  
		System.out.println("After Swap: " + a + " & " + b);
	}
	
	// Swap two Numbers Using * and / operator
	public static void swap2(int No1,int No2) {
		
		int a = No1;
		int b = No2;
		System.out.println("Before Swap: " + a + " & " + b);
		a = a * b;  
		b = a / b;  
		a = a / b; 
		System.out.println("After Swap: " + a + " & " + b);
		
	}
	
	// Addition of all digits
	public static void addAll(int No) {
		
		int a = No;
		int digit = 0;
		System.out.println("Number is: " + a);
		while(a > 0) {
			int count = a % 10;    // count get the last digit of a
			digit = digit + count;
			a = a / 10;          // delete the last digit in a
		}
		System.out.println("Addition of all digits is: " + digit);
	}
	
	// Reverse the digit
	public static void reverse(int No) {
		int i = No;
		int rev = 0;
		System.out.println("No is: " + i);
		
		while(i > 0) {
			int last = i % 10;    // get last digit
			rev = rev * 10 + last;  // add with multiply by 10 because we need extra 0 then add last digit
			i = i / 10;               // delete the last digit
		}
		System.out.println("Reverse the No: " + rev);
	}
	
	// Multiply all digits 
	public static void multiAllDigits(int No) {
		
		int i = No;
		int mul = 1;
		System.out.println("Number is: " + i);
		while(i > 0) {
			int last = i % 10;
			mul = mul * last;
			i = i / 10;
		}
		System.out.println("Multiplication of all digits are: " + mul);
	}
	
	// Count the digit in Numbers
	public static void countDigit(int No) {
		int i = No;
		int count = 0;
		System.out.println("No is: " + i);
		
		while(i > 0) {
			i = i / 10;
			count++;
		}
		System.out.println("Total digit is: " + count);
	}
	
	// Find Minimum and Maximum No 
	public static void maxAndMin(int No) {
		
		int i = No;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Value is: " + i);
		while(i > 0) {
			int last = i % 10;
			
			if(max < last) {
				max = last;
			}
			if(min > last) {
				min = last;
			}
			i = i / 10;
		}
		System.out.println("Minimum Number is: " + min);
		System.out.println("Maximum Number is: " + max);
	}
	
	
	
	
}



