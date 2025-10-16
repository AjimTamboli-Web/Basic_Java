package java_plane.Strings_types;

/*
 * 
 */

public class String_Buffers {

	public static void main(String[] args) {
		
		String ab = "adgs";
		StringBuffer sb = new StringBuffer("adgs");
		System.out.println(ab.equals(sb));
		System.out.println(sb.compareTo(new StringBuffer("VA")));
        
		String str = "Neveroddoreven";
		boolean isPalindrome = true;
		str = str.toLowerCase();
		
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
		if(	str.charAt(start) != str.charAt(end)) {
			isPalindrome = false;
			break;
		}
		start ++;
		end --;
		}
		
		if(isPalindrome) {
			System.out.println(str + " is Palindrome");
		}else
			System.out.println("Not Palindrome");
		
		System.out.println("*********************************************");
		
		String str3 = "NeverOddOrEven";
		
		
		str3 = str3.toLowerCase();
		boolean flag = true;
		
		for(int i =0; i< str3.length()/2;i++) {
			
			if(str3.charAt(i) != str3.charAt(str3.length()-1 - i)) {
				flag = false;
				break;
			}
		
			
		}
		
		if(flag) {
			System.out.println(str3 + " is Palindrome.");
		}
		else {
			System.out.println(str3 + " is not palindrome.");
		}
		
	}

}
