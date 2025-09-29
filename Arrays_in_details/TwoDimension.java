package java_plane.Arrays_in_details;

public class TwoDimension {

	public static void main(String[] args) {
		
/*
 *  A multidimensional array is an array that contains other arrays.You can use it to store data in a table with rows and columns.
 *  To create a two-dimensional array, write each row inside its own curly braces.
 *  You can use (length) to get the number of rows, and myNumbers[row].length for the number of columns in a given row.
 */
		
		int[][] arr = new int[5][5] ;             //{{4,54,56},{76,87,34,98}};
		
		int count = 0;
		 
// To access an element of a two-dimensional array, you need two indexes: the first for the row, and the second for the column.	 
		
		for(int i =0;i<arr.length;i++) {            // for Row
			
			for(int j =0;j<arr[i].length;j++) {     // for columns
				
				arr[i][j] = count;
				count++;
				System.out.print(arr[i][j] + " ");
				
				}	
			System.out.println();
			}
		System.out.println("Total: " + count);
        System.out.println("Row: " + arr.length);
        System.out.println("cols in Row 0: " + arr[0].length);
	}

}
