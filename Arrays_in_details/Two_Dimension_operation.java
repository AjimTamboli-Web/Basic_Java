package java_plane.Arrays_in_details;

public class Two_Dimension_operation {

	public static void main(String[] args) {
		
	//int[][] arr = new int[5][5] ;         
		
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

//			int counter = 1;
//			
//				for(int i=0;i<arr.length;i++) {
//					for(int j=0;j<arr[i].length;j++) {
//						
//			 // this one is better  arr[2][2] = -55
//						
//					if(i < 3 && i > 1  && j > 1 && j < 3) {      // instead of this
//							arr[i][j] = -55;  
//						}
//						else {
//						arr[i][j] = counter;	
//					}
//						counter++;
//						System.out.print(arr[i][j] + "  ");
//					}
//					System.out.println();
//				}
				
	// *************** Only prime numbers
				
//	int counter = 1;
//	 int no =0;
//   for(int i =0;i<arr.length;i++) {  // for rows
//	
//	  for(int j =0;j<arr[i].length;j++) {   // for columns
//		
//		    if(counter == 1) {
//			   arr[i][j] = 0;
//		    }
//		counter++;
//		
//		   if(counter > 1) {
//			 boolean isPrime = true;
//			
//			 for(int k = 2;k< counter;k++) {
//				 
//				   if(counter % k == 0) {
//					  isPrime = false;
//				  }
//			  }
//			 
//			 if(!isPrime) {
//				 arr[i][j] =0;
//			  }
//			    else {
//				  arr[i][j] = counter;
//				  no++;
//			    }
//		   }
//	 }	
//	  
//  }
//   
//   for(int i =0;i<arr.length;i++) {
//	   for(int j=0;j<arr[i].length;j++) {
//		   System.out.print(arr[i][j] + " ");
//	   }
//	   System.out.println();
//   }
//   
//   System.out.println("Total prime no is : " + no);
//   
   

	//********************** Upper bound matrix
	//  1 0 0
	//  2 3 0
	//  4 5 6	
		
	int[][] arr5 = new int[4][4];
	
	int counter = 1;
	
	for(int i =0; i<arr5.length;i++) {
		for(int j =0; j< arr5[i].length;j++) {
			
			if(i<j) {
			
				
			}else {
			arr5[i][j] = counter;
			counter++;
			}
		}
	}
	
	for(int i =0; i<arr5.length;i++) {
		for(int j =0;j< arr5[i].length;j++) {
			
			System.out.print(arr5[i][j] + " ");
			
		}
		System.out.println();
	}
	System.out.println("************************************");
	
// ********** Lower Bound matrix	
	// 1 2 3 
	// 0 4 5
	// 0 0 6
	
	int counter1 = 1;
	int[][] arr6 = new int[4][4];
	
	for(int i=0;i<arr6.length;i++) {
		for(int j = 0; j< arr6[i].length;j++) {
			
			if(i>j) {
				
			}
			else {
				arr6[i][j] = counter1;
				counter1++;
			}
		}
	}
	
	for(int i =0; i<arr6.length;i++) {
		for(int j = 0;j<arr6[i].length;j++) {
			System.out.print(arr6[i][j] + " ");
		}
		System.out.println();
	}
	
   System.out.println("******************************************");	
	
   
   // ****************** opposite site matrix
   //  0 0 1
   //  0 2 3 
   //  4 5 6
   
   
   int counter3 = 1;
   
   int[][] arr7 = new int[3][3];
   
   
   for(int i =0;i< arr7.length;i++) {
	   for(int j=0; j< arr7[i].length;j++) {
	       
		   int k =0;
		   while(k< arr7[i].length-(i+1)) {
			   arr7[i][k]=0;
			   k++;
		   }
			   
		   if(j>=k) {
		   arr7[i][j] = counter3;
		   counter3++;
	       }
	   }
   }
   
   for(int i=0;i<arr7.length;i++) {
	   for(int j =0;j<arr7[i].length;j++) {
		   System.out.print(arr7[i][j] + " ");
		   
	   }
	   System.out.println();
   }
   
	}

}
