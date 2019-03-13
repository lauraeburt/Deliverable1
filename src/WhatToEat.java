import java.util.Scanner;

class WhatToEat {

	public static void main(String[] args) {
		String eventType = "";
		int partySize = 0;
		String result = "";
		Scanner inputDevice = new Scanner(System.in);
		try {

			System.out.print("Please enter your party size: ");
			partySize = inputDevice.nextInt();

			if (partySize < 1) {
				System.out.println("Party size cannot be less than one. Your entry = " + partySize);
				System.exit(1);
			} 

			System.out.print("Please enter your event type (type casual, semi-formal, or formal): ");
			inputDevice.nextLine();
			eventType = inputDevice.nextLine();

			
			
		} catch (Exception e) {
			System.out.println("Invalid entry for party size.");
			System.exit(1);
		}

		result = "Since you're hosting a ";
		if (eventType.equals("casual")) {
			result += "casual event for ";
			if (partySize == 1) {
				result += partySize + " participant, you should serve sandwiches ";
				result += "in the microwave.";
			} else if ((partySize >= 2) && (partySize <= 12)) {
				result += partySize + " participants, you should serve sandwiches ";
				result += "in your kitchen.";

			} else if (partySize >= 13) {
				result += partySize + " participants, you should serve sandwiches ";
				result += "buy a caterer.";

			}
		} else if (eventType.equals("semi-formal")) {
			result += "semi-formal event for ";
			if (partySize == 1) {
				result += partySize + " participant, you should serve fried chicken ";
				result += "in the microwave.";
			} else if ((partySize >= 2) && (partySize <= 12)) {
				result += partySize + " participants, you should serve fried chicken ";
				result += "in your kitchen.";
			} else if (partySize >= 13) {
				result += partySize + " participants, you should serve fried chicken ";
				result += "buy a caterer.";

			}
		} else if (eventType.equals("formal")) {
			result += "formal event for ";
			if (partySize == 1) {
				result += partySize + " participant, you should serve chicken parmesan ";
				result += "in the microwave.";
			} else if ((partySize >= 2) && (partySize <= 12)) {
				result += partySize + " participants, you should serve chicken parmesan ";
				result += "in your kitchen.";
			} else if (partySize >= 13) {
				result += partySize + " participants, you should serve chicken parmesan ";
				result += "buy a caterer.";

			}
		}
		System.out.println (result);
                        inputDevice.close();	}
}