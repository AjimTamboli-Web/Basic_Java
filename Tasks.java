package java_plane;

public class Tasks {

	public static void main(String[] args) {	
	
		
		
	
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
			mul = mul * last;    // multiply by every digit and add to it  
			i = i / 10;          // then delete that digit
		}
		System.out.println("Multiplication of all digits are: " + mul);
	}
	
	//6 Count the digit in Numbers
	public static void countDigit(int No) {
		int i = No;
		int count = 0;                 // initialized the counter 0 
		System.out.println("No is: " + i);
		
		while(i > 0) {
			i = i / 10; 
			count++;      // just increment the value of counter on every iteration 
		}
		System.out.println("Total digit is: " + count);
	}
	
	//7 Find Minimum and Maximum No 
	public static void maxAndMin(int No) {
		
		int i = No;
		int max = Integer.MIN_VALUE;   // to compare other value initialize minimum for max find 
		int min = Integer.MAX_VALUE;   // to compare other value initialize maximum for min find
		System.out.println("Value is: " + i);
		while(i > 0) {
			int last = i % 10;
			
			if(max < last) {    // compare max less than single digit to find maximum digit
				max = last;     // then assign the value to them
			}
			if(min > last) {    // compare mini greater than digit to find minimum digit
				min = last;    // then transfer the value to them
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
				
			if(last % 2 == 0) {		// condition for even value if remainder remain 0 
				even = even * 10 + last;  // add one by one digit to the value
			 }
			
			// you can also use else here then you don't need to write condition 
			if(last % 2 != 0) {     // condition for odd value if remainder remain not 0 
				odd = odd * 10 + last;  // add that digit in value
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
				i = i + last;      // addition even number
			}else {
				j = j + last;     // addition odd number
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
	
		last = no % 10;    // get last digit
		
		while(no > 0) { 
		int temp = no % 10;
			first = temp;      // get first digit
			no = no / 10;     // just before delete it
		}
		 int result = first + last;    // then add first and last digit
		System.out.println("Addition of First and Last digit is: " + result);
	}
	
	//11 Swap only first and last digit => only four digits 
	public static void swapFirstLast(int No) {
		int no = No;
		int og = no;
		int first = 0;
		int last = 0;
		System.out.println("Before Swapped: " + no);
		
		last = no % 10;      // last digit
		while(no > 0) {
			int last2 = no % 10;   
			no = no / 10;
			first = last2;        // get first digit
		}
		int temp = og / 10;      // temp variable for delete the last digit
		int middle = temp % 100;   // then delete the first digit and get middle values
		
		int swapped = (last * 1000) + (middle * 10) + first;   // add one by one
		
		System.out.println("After Swapped: " + swapped);
		
	}
	
	//12 Prime numbers -> no that has only two factors, 1 and itself it gives no remainder. It cannot be divided evenly by any other no.
	public static void isPrime(int No) {
		int i = No;
		
		for(i=2;i< No;i++) {     
			boolean flag = true;    // get flag true on every iteration because when it in second loop it will be false 
			for(int j = 2; j<i;j++) { // every single digit compare that digit range
				if(i%j == 0) {      // if value get remainder zero then flag false
					flag = false;   // to differentiate value
				}
			}
			if(flag == true) {  // inside first loop for get that  prime value
				System.out.println("Prime No: " + i);  // print that value
			}
		}
		
	}
	
	//13 Palindrome -> is a number,word,sentence that reads the same forward and backward.
	public static void isPalinromes(int No) {
		int no = No;
		int forward = no;
		int backward = 0;
		
		while(no > 0) {
			int last = no % 10;
			backward = backward * 10 + last;  // reverse the value
			no = no / 10;
		}
		
		System.out.println("Forward : " + forward + " & " + " Backward : " + backward);
		if(forward == backward) {   // compare reverse and backward to find palindrome
			System.out.println("No is Palindrome.");
		}else
			System.out.println("No is Not-Palindrome.");
	}
	
	//14 Swap only first and last digit => any no of range
	public static void swapFirstLastAnyRange(int No) {
		
		int no = No;
		int og = no;
		int digiLen = String.valueOf(no).length();   // get value length using string methods  
		int first = 0;
		int last = no % 10;
		
		while(no > 0) {
			first = no;
			 no = no / 10;
		}
//		System.out.println(digiLen);
		
		int middle = (og % (int)Math.pow(10 , digiLen - 1)) / 10 ;  // get middle value using delete first and last value % and /
		
		int swap = (last * (int)Math.pow(10, digiLen - 1)) + (middle * 10) + first; // then add it one by one
		
//		System.out.println(middle);
		System.out.println(swap);
		
		
	}
	
	//15 Armstrong Number(narcissistic number) -> number that is equal to the sum of its own digits,each raised to the power of the number of digits.
	
	   
	
}



