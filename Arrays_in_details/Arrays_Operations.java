package java_plane.Arrays_in_details;

public class Arrays_Operations {

	public static void main(String[] args) {

	// find largest and smallest number
		
//		int[] arr = new int[] {34,-6,54,89,44,13,-76,92,-24};
//		
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//				System.out.println(min); // it shows how many iteration done to find
//			}
//			if(arr[i] > max) {
//				max = arr[i];
//				System.out.println(max);
//			}
//		}
//		System.out.println("Minimum: " + min + " Maximum: " + max);
	
	// Get second and third highest number
		
		int[] arr5 = new int[] {34,86,98,45,32,213,21,4};
		
		int large = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		int fourth = Integer.MIN_VALUE;
		
		for(int k=0;k<arr5.length;k++) {
			if(arr5[k] > large) {
				second = large;
				large = arr5[k];
				//System.out.println("hi" + large);
			}
			if(arr5[k] > second && arr5[k] < large) {
				third = second;
				second = arr5[k];
				//System.out.println("sec " + second);
			}
			if(arr5[k] > third && arr5[k] < second) {
				fourth = third;
				third =  second;
				second = arr5[k];
			//	System.out.println("third" + third);
			}
			if(arr5[k] > fourth && arr5[k] < third) {
				fourth = arr5[k];
			}
		}
		System.out.println("Highest: " + large);
		System.out.println("Second hi: " + second);
	    System.out.println("Third hi: " + third);
		System.out.println("Fourth hi: " + fourth);
	
		
	// inserting a values using loops
		
//		int[] arr1 = new int[5];
//		
//		for(int j=0;j<arr1.length;j++) {
//			arr1[j] = j+5;              // operations on values
//			System.out.println("index of: "+j + " value is: "+arr1[j]);
//		}
		
	   
	}

}
