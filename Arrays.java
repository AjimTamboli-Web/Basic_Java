package java_plane;

public class Arrays {

	public static void main(String[] args) {
	
/*    Array is an important linear data structure that allows us to store multiple values of the same type.
 *   Arrays are used to stored multiple values in a single variables, instead of declaring separate variables for each value.
 *   Arrays in java are objects, like all other object in java, this allow you to invoke implicitly inherit from the java.lang.Object class.
 *   The first element of the array is at index 0, all elements must be of the same type, can store only Homogeneous elements.
 *   After creating array, its size is fixed, we can't change it. 	Stored in heap memory.
 *   Array types: Single dimensional, Multi-dimensional, Jagged array - array of arrays with different length 	
 */
	 //	Declaration + initialization together
		int[] i = {12,34,56,87,98,982};
		System.out.println(i[0]);           // print first elements
		
		int[] j ;          // Declaration
		j = new int[5];    // Memory allocation
		j[0] = 43;         // initialization
        j[1] = 65;
        j[4] = 23;
          
        for(int k=0;k<j.length;k++) {       // Print all value in array using for loop
        	System.out.println("Element of index: " + k + "= " +j[k]);
        }
        
        for(int arr:j) {                 // Print values using for-each loop  
        	System.out.println(arr);
        }
        
  System.out.println("*****************************");     
        int [] arr = new int[] {4,6,2,7,8,2,9};   // use when you know the values .
        int sum = 0;
        
        for(int l =0;l<arr.length;l++) {
        	sum += arr[l];                       // Sum of array elements
        }
        System.out.println("Sum: " + sum);

    System.out.println("*****************************");  
    
   // Highest and lowest value        1st way
    int [] arr1 = new int[5];
    arr1[0] = 2;
    arr1[1] = 32; 
    arr1[2] = 564;
    arr1[3] = -23;
    arr1[4] = 76;
    
    int min = arr1[0];
    int max = arr1[0];
    
    for(int a : arr1) {
    	if(a > max) {
      	   max = a;
         }
        if(a < min) {
    	   min = a;
        }
      
    }
    System.out.println("Max: " + max + " Min: " + min);
    System.out.println("*****************************");     
    
    // find lowest and highest value       2nd way
    
    int[] numbers = new int[] {23,56,-76,89,34,656,7,-345}; 
    
    int maxi = Integer.MIN_VALUE;
    int mini = Integer.MAX_VALUE;
    
    for (int l = 0;l<numbers.length;l++) {
    	
    	if(numbers[l] > maxi) {
    		  maxi = numbers[l];
    	}
    	if(numbers[l] < mini) {
    		mini = numbers[l];
    	}
    }
    System.out.println("Maximum val: " + maxi + " Minimum val: " + mini);
    System.out.println("******************************************");
    
    // insert a value in array
    
    int a[] = new int[10];
    for(int w=0;w<10;w++) {
    	a[w] = w+5;
    	System.out.println( w +" index value of array: " + a[w]);
    }
    System.out.println(a[0] + "position");
    
    
    
    
	}

}
