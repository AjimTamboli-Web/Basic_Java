package java_plane;

public class Rough {

	public static void main(String[] args) {
		
	int no = 98756345;
	int og = no;
	int digiLen = String.valueOf(no).length();    
	int first = 0;
	int last = no % 10;
	
	while(no > 0) {
		first = no;
		 no = no / 10;
	}
	System.out.println(digiLen);
	
	int middle = (og % (int)Math.pow(10 , digiLen - 1)) / 10 ;
	
	int swap = (last * (int)Math.pow(10, digiLen - 1)) + (middle * 10) + first;
	
	System.out.println(middle);
	System.out.println(swap);
	}

}
