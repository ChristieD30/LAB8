import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		int i;
		String contYN;

		String[] names = { "Christie", "Lindsay", "Angela", "Aja", "Gale", "Charlotte" };
		String[] hometown = { "Christieland, MI", "Lindsaytown, MI", "Los Angelaes, CA", "Ajadale, MI", "Galesburg, MI",
				"Charlottesville, MI" };
		String[] food = { "french fries", "ginger", "botana", "lasagna", "grapefruit", "tacos" };

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our Java Class.\n");

		//print the array as a list
		for (int j = 0; j < names.length; j++) {
			System.out.println((j + 1) + ". " + names[j]);
		}
		//validates that they entered a number that will work. 
		i = Validator.getInt(scan, "\nPlease print a number 1-6 to learn about that student.\n", 1, names.length);

		String userNames = names[i - 1];

		System.out.println("\nStudent number " + i + " is " + userNames);

		System.out.println("\nWhat would you like to know about " + userNames + "?");
		
		do {

			String userChoice = Validator.getString(scan, "Enter hometown or food.");

			// match number to student info
		
			if (userChoice.equalsIgnoreCase("hometown")) {

				String userHometown = hometown[i - 1];

				System.out.println(userNames + "'s hometown is " + userHometown + ".");
				
			} else if (userChoice.equalsIgnoreCase("food")) {
				
				String userFood = food[i - 1];
				
				System.out.println(userNames + "'s favorite food is " + userFood + ".");
				
			} else {
				System.out.println("That is not a valid option.");	
			
			}
			
			//prompt them to restart the program
			System.out.println("Would you like to know something else about " + userNames + "?");
			System.out.println("Enter Yes or no.");

			contYN = scan.next();

		} while (contYN.equalsIgnoreCase("yes") || contYN.equalsIgnoreCase("y"));

		System.out.println("Thank you for getting to know our Java class student!");

		scan.close();

	}

}


