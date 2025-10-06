package java_plane.Methods_inJava;

/*
 * Parameters are variables defined in the method declaration after the method name, inside the parentheses. 
 * This includes primitive types such as int, float, boolean, etc, and non-primitive or object types such as an array, String, etc.
 * Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
 * You can pass values(Argument) to the method parameters, at the method call. The method call has the same number of arguments and is in the same order, as the parameters.
 * You can add many different types of parameters but java gives a limit, the limit says you can add 255 parameters or less.
 * All primitive or non-primitive types take one unit of parameter length, except long and double.
 * long or double takes two units of parameter length. The total length of parameters is calculated by the sum of the total units of all parameters.(127)
 * When we talk about the non-static method, the non-static method accepts only 254 parameters.
 * 
 * An argument is a value passed to a function when the function is called.
 * Whenever any function is called during the execution of the program there are some values passed with the function. These values are called arguments.
 * when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.
 */

public class Parameters_arguments {

	public static void main(String[] args) {
	
		Add add = new Add();
		add.add(23, 54);   // in add method we provide the value is argument
		
		
	}

}


class Add{
	
	// in method we assign a and b is parameters
	
	public void add(int a, int b) {
	 int z = a + b;
		System.out.println(z);
	}
}
