package java_plane.Arrays_in_details;

public class Three_Di {

	public static void main(String[] args) {

		int[][][] arr = new int[4][3][4];
//		
//		arr[0] = new int[2][];
//		arr[1] = new int[3][];
//		arr[2] = new int[4][];
		
		int counter = 1;
		for(int i =0;i<arr.length;i++) {
			
			for(int j =0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[j].length;k++) {
					
					arr[i][j][k] = counter;
					counter++;
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}	
		
	}

}
