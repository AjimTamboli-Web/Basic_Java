package java_plane;

public class Tasks {

	public static void main(String[] args) {
		
		
		
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
}
