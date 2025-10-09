package java_plane.Methods_inJava;

/*
 *  Constructor Injection means passing the required values (dependencies) to an object through its constructor at the time of object creation.
 *  Instead of setting values later with setter methods, you inject the values directly through the constructor.
 *  Why use? -> values must be provided at object creation, object is always in a complete state, Easier to ensure required dependencies.
 *  constructor injection is possible with multiple classes
 *  If the values are passed inside new — that’s Constructor Injection. 
 */

public class Constructor_Injection {

	public static void main(String[] args) {
		
		// Values injected at creation time	
		ConstInject inject = new ConstInject(23,"Lannister");
		inject.display();
		
		
		Address ad = new Address("Ahmednagar","Maharashtra");
		
		// here Employee is class dependent on Address.
		Employee emp = new Employee(1,"Tyrion",ad);
		// we inject the Address object into Employee's constructor.
		
		emp.display();

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
		System.out.println("Id: " + i + "  Name: " + name);
	}
}


class Address{
	String city;
	String state;
	
	Address(String city,String state){
		this.city = city;
		this.state = state;
	}
}

class Employee{
	int id;
	String name;
	Address address;
	
	Employee(int id, String name, Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + ", " + address.state);
	}
}






