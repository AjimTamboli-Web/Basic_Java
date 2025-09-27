package java_plane;


public class Demo {

	public static void main(String[] args) {
		
		System.out.println(" Hello World \n This is \n Demo" );
		
		int i = 3543;
		int ori = i;
		int rev = 0;
		
		while(ori > 0) {
			int d = ori % 10;
			rev = rev * 10 + d;
			ori = ori / 10;
		}
		if(i == rev) {
	      System.out.println("It's Palindome");
		}
		else {
			System.out.println("it's not");
		}
		
		
	}

}
