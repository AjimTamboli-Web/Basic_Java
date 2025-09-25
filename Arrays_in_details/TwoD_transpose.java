package java_plane.Arrays_in_details;

public class TwoD_transpose {

	public static void main(String[] args) {

		int counter = 1;

		int[][] arr = new int[3][3];
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j = 0;j<arr[i].length;j++) {
				
				arr[i][j] = counter;
				counter++;
				
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j = 0;j<arr[i].length;j++) {
				
				System.out.print(arr[j][i] + " ");  //  just swap i and j to transpose
				
			}
			System.out.println();
		}
		
	} 

}
