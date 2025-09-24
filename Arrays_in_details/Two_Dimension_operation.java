package java_plane.Arrays_in_details;

public class Two_Dimension_operation {

	public static void main(String[] args) {
		
	int[][] arr = new int[5][5] ;         
		
	// *************  Diagonal array
	
//		int flag = 1;
//		 	 
//		for(int i =0;i<arr.length;i++) {  // for rows
//			
//			for(int j =0;j<arr[i].length;j++) {   // for columns
//				
//				
//				if(arr[i]==arr[j]) {      // operation logic put only where identity found  00,11,22,33.....
//					arr[i][j] = 1;     // what val put in that place
//				}
//				else {
//					                      
//				arr[i][j] = flag;
//				flag++;
//				}
//				
//				System.out.print(arr[i][j] + " ");
//				
//				}	
//			System.out.println();
//			}
	
	// ********** change value only first two rows

//	int counter = 1;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				
//				if(i<2) {                       // affected only 2 rows 0 and 1 with column
//					arr[i][j] = counter * 9;
//				}
//				else {
//				arr[i][j] = counter;	
//			}
//				counter++;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
  // ****************** change value on last column		

//		int counter = 1;
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[i].length;j++) {
//					
//					if(j > 3) {                       // affected only last column 
//						arr[i][j] = counter * 7;
//					}
//					else {
//					arr[i][j] = counter;	
//				}
//					counter++;
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}
		
	// *********************** change value on particular location
			  // Ex : (2,3) = 00;

			int counter = 1;
			
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						
			 // this one is better  arr[2][2] = -55
						
					if(i < 3 && i > 1  && j > 1 && j < 3) {      // instead of this
							arr[i][j] = -55;  
						}
						else {
						arr[i][j] = counter;	
					}
						counter++;
						System.out.print(arr[i][j] + "  ");
					}
					System.out.println();
				}
			
	}

}
