package java_plane;

public class Tasks {

	public static void main(String[] args) {
          
		
		
          Task.firstLastAdd(923456789);
	}	
}

class Task{
	 //1 Swap two Numbers Using + and - operator
	public static void swap(int No1,int No2) {
		int a = No1;
		int b = No2;
		System.out.println("Before Swap: " + a + " & " + b);
		a = a + b;  // get first addition of both
		b = a - b;  // get the value of b first
		a = a - b;  // last get value of a
		System.out.println("After Swap: " + a + " & " + b);
	}
	
	//2 Swap two Numbers Using * and / operator
	public static void swap2(int No1,int No2) {
		
		int a = No1;
		int b = No2;
		System.out.println("Before Swap: " + a + " & " + b);
		a = a * b;  
		b = a / b;  
		a = a / b; 
		System.out.println("After Swap: " + a + " & " + b);
		
	}
	
	//3 Addition of all digits
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
	
	//4 Reverse the digit
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
	
	//5 Multiply all digits 
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
	
	//6 Count the digit in Numbers
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
	
	//7 Find Minimum and Maximum No 
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
	
	//8 Find Even and Odd Number
	public static void oddAndEven(int No) {
		int i = No;
		int even = 0, odd = 0, rev = 0;
		System.out.println("Number is : " + i);
		
		while(i > 0) {   // not compulsory to reverse the digits but looks good to read
			int last = i % 10;
			rev = rev * 10 + last;
			i = i / 10;
		}
		
		while(rev > 0) {       // i became rev  because we need loop start with first digit
			int last = rev % 10;
				
			if(last % 2 == 0) {		
				even = even * 10 + last;
			 }
			if(last % 2 != 0) {
				odd = odd * 10 + last;
			 }	
			rev = rev / 10;
		}
		System.out.println("Even Values: " + even);
		System.out.println("Odd Values: " + odd);
		
	}
	
	//9 Additions of odd and even numbers different
	public static void evenOddAdd(int No) {
		int no = No;
		int i = 0;
		int j = 0;
        System.out.println("Number is: " + no);
     
		while(no > 0) {
			int last = no % 10;
			if(last % 2 == 0) {
				i = i + last;
			}else {
				j = j + last;
			}
			no = no / 10;
		}
		System.out.println("Even Number Addition is: " + i);
		System.out.println("Odd Number Addition is: " + j);
	}
	
	//10 Sum of First and Last digit
	public static void firstLastAdd(int No) {
		int no = No;
		int first = 0;
		int last = 0;
		System.out.println("Number is: " + no);
	
		last = no % 10;
		
		while(no > 0) {
		int temp = no % 10;
			first = temp;
			no = no / 10;
		}
		 int result = first + last;
		System.out.println("Addition of First and Last digit is: " + result);
	}
	
	//11 Swap only first and last digit
	
	
	//12 Prime numbers
	
	
}



