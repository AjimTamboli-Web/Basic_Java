package java_plane.Methods_inJava;

/*
 *  we used the void keyword in greet() which indicates that the method should not return a value.
 *  If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method.
 *  return keyword in Java is a reserved keyword which is used to exit from a method, with or without a value. 
 *  
 */

public class Method_ReturnValue {

	public static void main(String[] args) {
		
		Animals.greet();
		
		Animals cat = new Animals();
		Animals dog = new Animals();
		
		cat.type = "Cat";
		cat.name = "Tom";
		cat.sound = "Meow meow";
		System.out.println(cat.type());
		cat.name();
		System.out.println(cat.sound());
		cat.buy(299);                       // get parameters
		
	System.out.println("************************************");	
		
		dog.type = "Dog";
		dog.name = "Bob";
		dog.sound = "bow bow";
		System.out.println(dog.type());
		dog.name();
		System.out.println(dog.sound());
		dog.buy(345);
		
		dog.without(34);  // ex of return in if else 
		
	}

}



class Animals{
	
	String name;
	String sound;
	String type;
	int price;
	
	final static String time = "Open at 10 To 5";
	
	public static void greet() {
		System.out.println("************ Welcome to Animal shops ***************");
		System.out.println(" \t \t \t \t \t" +time);
	}

	public String type() {
		System.out.print("Animal type is: " );        // return string type
		return type;
	}
	
	public String sound() {                  // return string sound
		return "sound:: " + sound;
	}
	
	public void name() {
		System.out.println(type + " name is: " + name);	
	}
	
	public int buy(int price) {                          // Passing parameters
		if(price >= 200)
		   System.out.println("Sold at: " + price);
		else
		System.out.println("Amount is low!");
		return price;
	}
	
	void without(int pri) {    // return in void method using if else conditions
		if(pri < 100) {
			System.out.println(pri);
			return;
		}
		else
			System.out.println("nothing");
	}
	
}

