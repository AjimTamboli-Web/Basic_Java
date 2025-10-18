package java_plane;

public class Tasks {

	public static void main(String[] args) {
		
		Task.addAll(1234);
		
		
	}
}

class Task{
	 // Using + and - operator
	public static void swap(int No1,int No2) {
		int a = No1;
		int b = No2;
		System.out.println("Before Swap: " + a + " & " + b);
		a = a + b; 
		b = a - b;  
		a = a - b;  
		System.out.println("After Swap: " + a + " & " + b);
	}
	
	// Using * and / operator
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
			int count = a % 10;
			digit = digit + count;
			a = a / 10;
		}
		System.out.println("Addition of all digits is: " + digit);
	}
	
}
