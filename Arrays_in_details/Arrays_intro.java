package java_plane.Arrays_in_details;

public class Arrays_intro {

	public static void main(String[] args) {
	// Array is an important linear data structure that allows us to store multiple values of the same type.
 
		int[] arr = {132,454,965, -53,34, -7,-745};  // stored multi values in single variables
	// index start at: 0   1   2    3   4   5   6	  and end with length - 1
		
		System.out.println(arr[3]);   // you can access with index number
	    System.out.println("***************************");
	
		for(int i=0;i<arr.length;i++) {  // to print all values use loop
			System.out.println(arr[i]);
		}

		System.out.println("***************************");
	// ways of initialize the array with value
		int[] arr1 = {43,65,76,98,23,45};        // when you know the values or range
		int[] arr2 = new int[5];                // declare array size
		int[] arr3 = new int[] {23,87,45,9,23,5};
		
		arr3[0] = 83;    // changing the first element to 83
		
		for(int a:arr1) {          // using for-each print all values
			System.out.println(a);
		}
		System.out.println("***************************");
 // ** System.out.println(arr2[6]);   // when you access the elements outside the array size its ArrayIndexOutOfBoundExceptin error
		
 //  when you want to insert a value in arrays using loops 	
		int[] arr4 = new int[20];
		for(int i=0;i<arr4.length;i++) {
			arr4[i] = i+5;               // insert a value in array
			System.out.println("index no: " + i + " value is: " + arr4[i]);
		}
		System.out.println(arr4[0]);    // o/p : 5
		
	}

}
