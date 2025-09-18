package java_plane.Control_Statements_loops;

public class Best_loop {

	public static void main(String[] args) {
	// THis program is finding fast loop in execution process.	
		
		int k =0;
		final long startloop = System.currentTimeMillis();
		
		do {
			System.out.print("Hi3 ");
			k++;
		}while(k<1000);
		
		final long endloop = System.currentTimeMillis();
		long doWhile = endloop-startloop;
		System.out.println("Total Execution time : " + doWhile);
		
		
		final long  startTime = System.currentTimeMillis();
		
		for(int i=0;i<1000;i++) {
			System.out.print("hi1 ");
		}
		
		final long endTime = System.currentTimeMillis();
		long forLoop = endTime-startTime;
		System.out.println("Total Execution time : " + forLoop);

		
		
		int j =0;
		final long start = System.currentTimeMillis();
		
		while(j<1000){
			System.out.print("Hi2 ");
			j++;
		}
		
		final long end = System.currentTimeMillis();
		long whileLoop = end-start;
		System.out.println("Total Execution time : " + whileLoop);
		
		
		System.out.println("Final Output : " + "\nFor Loop Time: " + forLoop + "\nWhile Loop Time: " + whileLoop + "\nDo While Loop: " + doWhile);
		//Hence prove Do_While Loop is faster than other loop	
	}

}
