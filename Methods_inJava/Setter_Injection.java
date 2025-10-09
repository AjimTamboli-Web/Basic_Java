package java_plane.Methods_inJava;

/*
 * Values are set after object creation. This is called setter injection (not constructor injection).
 * 
 */

public class Setter_Injection {

	public static void main(String[] args) {

       SetInje setInject = new SetInje();
       
       setInject.setI(11);
       setInject.setName("Tom");
       setInject.setChars('T');
       
       setInject.display();

	}

}

class SetInje{
	
	int i;
	String name;
	char chars;
	
	public void display() {
		System.out.println("ID: " + i + "\nName: " + name + "\nChars: " + chars);
	}
	
	public void setI(int i) {
		this.i = i;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setChars(char chars) {
		this.chars= chars;
	}
	
	
	
}

