package java_plane.Methods_inJava;

/*
 *  Constructor Injection means passing the required values (dependencies) to an object through its constructor at the time of object creation.
 *  Instead of setting values later with setter methods, you inject the values directly through the constructor.
 *  
 */

public class Constructor_Injection {

	public static void main(String[] args) {
		
		// Values injected at creation time
		
		ConstInject inject = new ConstInject(534,"Sdfhdksj");
		inject.display();

	}

}

class ConstInject{
	
	int i;
	String name;
	
	// Constructor injection happens here  
	ConstInject(int i, String name){
		this.i = i;
		this.name = name;
	}
	
	void display() {
		System.out.println("Id: " + i + "\nName: " + name);
	}
	
	
}
