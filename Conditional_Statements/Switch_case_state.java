package java_plane.Conditional_Statements;

public class Switch_case_state {

	public static void main(String[] args) {
		
		String day = "sdsa";
		switch(day) {
		case "Monday": {
			System.out.println("Today is monday.");
			break;
		}
		case "Thuesday":{
			System.out.println("Today is Thuesday.");
			break;
		}
		case "Wednesday":{
			System.out.println("Today is Wednesday.");
			break;
		}
		case "Thusday":{
			System.out.println("Today is Thusday.");
			break;
		}
		case "Friday":{
			System.out.println("Today is Friday.");
			break;
		}
		case "Saturday":{
			System.out.println("Today is Saturday.");
			break;
		}
		case "Sunday":{
			System.out.println("Today is Sunday.");
			break;
		}
		default:{
			System.out.println("Select only days.");
		}
		}

	}

}
