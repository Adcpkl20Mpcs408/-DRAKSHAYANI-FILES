package org.tnsif.capgemini.c2tc.Basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="Sunday";
		
		switch(day)
		{
		case "Monday":
		case "monday":
		System.out.println("Veg rice");
		break;
			
		case "Tuesday":
		case "tuesday":
		System.out.println("Sambar");
		break;
			
		case "Wednesday":
		case "wednesday":
		System.out.println("Egg curry");
		break;
			
		case "Thursday":
		case "thursday":
		System.out.println("Dal rice");
		break;
		
		case "Friday":
		case "friday":
		System.out.println("Fried rice");
		break;
		
		case "Saturday":
		case "saturday":
		System.out.println("Jeera rice");
		
		case "Sunday":
		case "sunday": 
		System.out.println("Biryani");
			break;
			
			default:
			{
				System.out.println("invalid day in mess menu");
			}
	
	}

}
}