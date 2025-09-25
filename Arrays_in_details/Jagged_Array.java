package java_plane.Arrays_in_details;

public class Jagged_Array {

	public static void main(String[] args) {
	
		int[][] arr = new int[4][];
		
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
		
		System.out.println("******************");
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j =0;j<arr[i].length;j++) {
				
		
				System.out.print( "*"+ arr[i][j] + "*");
				
			}
			System.out.println();
		}
		System.out.println("Total no::  " + sum);
	}

}
