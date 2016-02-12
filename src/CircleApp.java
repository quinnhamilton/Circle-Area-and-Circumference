import java.util.Scanner;

/**
 * @author Harley Quinn
 *
 */
public class CircleApp {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String contin = "y";
		
		System.out.println("Welcome to the Circle Tester!");
		
		while (contin.equalsIgnoreCase(("y"))){
		System.out.println("Please enter radius: ");
		int radius = getValidIntegerInRange(0,scanner);
		Circle circle = new Circle(radius);
		
		System.out.println("Circumference: " + circle.getFormattedCircumference());
		System.out.println("Area: " + circle.getFormattedArea());
		
		
		// asks user if they'd like to continue and enter another circle's radius
		System.out.println("Would you like to enter another circle's radius: ");
		contin = isValidChoice(scanner);
		}
		
		// if the user doesn't want to continue, the code below will run and the application will end
		if (contin.equalsIgnoreCase("n")) {
			System.out.println("You created " + Circle.Counter + " Circle object(s).");
			System.out.println("Thanks for using the Circle Tester!");
		}
		scanner.close();
		}
		
		
	public static int getValidInteger(Scanner scanner){
		// Loops while the input is not an integer
		while (!scanner.hasNextInt()) {
			System.out.println("Please enter a valid integer!");
			scanner.nextLine(); // consume the new line
		}
		int number = scanner.nextInt();
		scanner.nextLine();
		return number ;
	}
	
	public static int getValidIntegerInRange(int min, Scanner scanner) {

		int number = getValidInteger(scanner);// get a valid number
		// loops when number is less than the min
		while (number < min) {
			System.out.println("Please enter a number greater than " + min);
			number = getValidInteger(scanner);// get a valid number
			}
		return number;
		}

	public static String isValidChoice(Scanner input) {
        String choice = input.nextLine();
        //loops while not a String input of y,Y,n,N
        while(!choice.matches("^[ynYN]$")) {
            System.out.println("That is not a valid option.");
            System.out.println("Would you like to continue? (y/n): ");
            choice = input.nextLine();
        }
        return choice; 
    }

	
}



