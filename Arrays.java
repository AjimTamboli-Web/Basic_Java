package java_plane;

public class Arrays {

	public static void main(String[] args) {
		
		int[] i = {12,34,56,87,98,982};
		System.out.println(i);
		
		int[] j = new int[5];
		j[0] = 43;
        j[1] = 65;
        j[4] = 23;
     //   System.out.println(j[4]);
        
        // Print all value in array using for loop
        for(int k=0;k<j.length;k++) {
        	System.out.println(j[k]);
        }
        
       // Print values using for-each loop  
        for(int arr:j) {
        	System.out.println(arr);
        }
	}

}
