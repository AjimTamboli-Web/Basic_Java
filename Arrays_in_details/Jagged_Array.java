package java_plane.Arrays_in_details;

public class Jagged_Array {

	public static void main(String[] args) {
		
/* A Jagged array is a multidimensional array where each row can have a different number of columns.
 * When we work with a jagged array, one thing to keep in mind is that the inner array can be of different lengths.
 * It is like a 2D array, but each row can have a different number of elements.  With jagged array we can decide the size at runtime.
 * Jagged arrays are faster because we only store what we needed and that why accessing the data becomes faster.
	 
*/
		
//	data_type array_name[][] = new data_type[n][];     // n= no. of rows
	int[][]     arr          = new   int[4][];
		
//	array_name[0] = new data_type[n1]        //n1= no. of columns in row-1
		arr[0] = new int [3];
		arr[1] = new int [4];
		arr[2] = new int [5];
		arr[3] = new int [6];
		
		int sum = 0;

		int counter = 1;
		
		
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length;j++) {
				
				arr[i][j] = counter;
				counter++;
				sum =  counter;
				
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
System.out.println("*************************************************");
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j =0;j<arr[i].length;j++) {
				
		
				System.out.print( "*"+ arr[i][j] + "*");
				
			}
			System.out.println();
		}
		System.out.println("Total no::  " + sum);
	}

}
