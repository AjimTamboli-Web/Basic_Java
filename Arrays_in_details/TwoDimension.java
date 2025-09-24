package java_plane.Arrays_in_details;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5] ;             //{{4,54,56},{76,87,34,98}};
		
		int flag = 1;
		 
		 
		for(int i =0;i<arr.length;i++) {
			
			for(int j =0;j<arr[i].length;j++) {
				
				arr[i][j] = flag;
				flag++;
				System.out.print(arr[i][j] + " ");
				
				}	
			System.out.println();
			}

	}

}
