package java_plane.Arrays_in_details;

public class Arrays_Operations {

	public static void main(String[] args) {

	// find largest and smallest number
		
		int[] arr = new int[] {34,-6,54,89,44,13,-76,92,-24};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				System.out.println(min); // it shows how many iteration done to find
			}
			if(arr[i] > max) {
				max = arr[i];
				System.out.println(max);
			}
		}
		System.out.println("Minimum: " + min + " Maximum: " + max);
	
	
	// inserting a values using loops
		
		int[] arr1 = new int[5];
		
		for(int j=0;j<arr1.length;j++) {
			arr1[j] = j+5;              // operations on values
			System.out.println("index of: "+j + " value is: "+arr1[j]);
		}
	
	}

}
