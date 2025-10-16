package java_plane.Strings_types;

/*
 * A String is a sequence of characters used to store and manipulate text.Strings are immutable, meaning once created, they cannot be changed.
 * You can create a string using string literal or new keyword.
 * Operations - Concatenation - join two strings, Length - Finds string length, CharacterAt - Gets characters at position, Compare .equals - compare string values
 *               Replace - replaces characters, toUpperCase - converts to capital letters  etc.......
 *  It is immutable. It has many built-in methods for operations like search, compare, modify, extract.
 *  For changing strings frequently, use StringBuilder or StringBuffer.             
 */

public class Strings_Operations {

	public static void main(String[] args) {
	 
		// create a string
	 String text = " Hello Java World ";
	 
	 System.out.println("Original String : '" + text + "'" );
	 
	 // trim() -> all leading and trailing space removed.
	 String trimmed = text.trim();
	 System.out.println("After trim: '" + trimmed + "'" );
	 
	 // length() -> Returns the length of this string. The length is equal to the number of Unicode code units in the string.
	 
	 System.out.println("Length: " + trimmed.length());
	 
	 // toUpperCase() and toLowerCase() -> 
	 System.out.println("Uppercase: " + trimmed.toUpperCase());  // converted to uppercase
	 System.out.println("Lowercase: " + trimmed.toLowerCase());  // converted to lowercase.
	 
	 // charAt() -> the char value at the specified index of this string. The first char value is at index 0.
	 System.out.println("Character at index 1: " + trimmed.charAt(1));
	 
	 // substring() -> beginIndex the beginning index, inclusive.
	 //                endIndex the ending index, exclusive.
	 //             length of the substring is endIndex-beginIndex.
	 System.out.println("Substring (0 to 5): " + trimmed.substring(0,5));
	 
	 // contains() -> Returns true if and only if this string contains the specified sequence of char values. true if this string contains s, false otherwise
	 
	 System.out.println("Contains 'Java'? " + trimmed.contains("Java"));
	 
	 // replace() -> Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
	 System.out.println("Replace 'Java' with 'Programming' :  " + trimmed.replace("Java", "Programming"));
	 
	 // split() -> the array of strings computed by splitting this string around matches of the given regular expression.
	 String[] words = trimmed.split(" ");
	 System.out.println("Split Worlds: ");
	 for(String ward : words) {
		 System.out.println(ward);
	 }
	 
	 // equals() and equalsIgnoreCase() -> The object to compare this String against
	 String str = "HELLO";
	 String str2 = "hello";
	 // true if the given object represents a String equivalent to this string, false otherwise
	 System.out.println("Equals: " + str.equals(str2));
	 // true if the argument is not null and it represents an equivalent String ignoring case; false otherwise
	 System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2));
	 
	 
	 // indexOf
	 System.out.println("Index of 'J' : " + trimmed.indexOf('J'));
	 
	 
	 String var = "  ";
	 System.out.println("IsBlank: " + var.isBlank()); // Returns true if the string is empty or contains only white space codepoints, otherwise false.
	 System.out.println("IsEmpty: " + var.isEmpty()); // Returns true if, and only if, length() is 0.
	 
	 
	 // Palindrome 
	 
	 String str12 = "madam";    
     
		boolean isPalindrome = true;
		
		int start = 0;
		int end = str12.length()-1;
		
		while(start < end) {
//			System.out.println(start + "  ** " + end);
			if(str12.charAt(start) != (str12.charAt(end)) ) {
				isPalindrome = false;
					break;
			}
			start++;
			end--;
		}
		
		if(isPalindrome) {
			System.out.println(str12 + " is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	 
	}

}





