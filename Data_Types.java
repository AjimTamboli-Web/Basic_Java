package java_plane;


public class Data_Types {

	public static void main(String[] args) {
		// Data types :
		// Primitive Data types :: byte,short, int, float, double, char, boolean
		// Non-Primitive Data types :: String, Arrays, Classes.
		// Variables are containers for storing data values.
		String  name =  "Tom";  
		int     age =        24;	
		double salary = 34325.43;
		char    div =       'A';
		boolean isGood  = true;
		
		System.out.println("Employee Name is :: " + name);
		System.out.println("Age of emp. :       " + age);
		System.out.println("Salary of emp :     " + salary);
		System.out.println("Div of emp :        " + div);
        System.out.println("Is he good at work :: " + isGood);
		
	 //  It adds the data which interact the first like String+int+double+char as it is
		
		System.out.println("THis flow right to left : " + name+age+salary+div); //this adds line by line
		
	//  it also work left to right it adds all the data with String 
		System.out.println("This adds the whole variables" +age+div+name+salary);   // left to right
	
       System.out.println("This adds a ASCII values in char variables :: " +div+age+name);
       
       
       
       
	}

}
