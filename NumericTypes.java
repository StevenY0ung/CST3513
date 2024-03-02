import java.util.Scanner;
// TASK #2 Add an import statement for the Scanner class 

// This program demonstrates how numeric types and operators behave in Java.
public class NumericTypes {
    public static void main(String[] args) {
        // TASK #2 Create a Scanner object here
        Scanner keyboard = new Scanner(System.in);

        // Identifier declarations
        final int NUMBER = 2; // Number of scores
        final int SCORE1 = 100; // First test score
        final int SCORE2 = 95; // Second test score
        final int BOILING_IN_F = 212; // Boiling temperature
        int fToC; // Temperature Celsius
        double average; // Arithmetic average
        String output; // Line of output

        // Find an arithmetic average.
        average = (SCORE1 + SCORE2) / (double) NUMBER;
        output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
        System.out.println(output);

        // Convert Fahrenheit temperature to Celsius.
        fToC = 5 * (BOILING_IN_F - 32) / 9;
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        System.out.println(output);
        System.out.println(); // To leave a blank line

        // Prompt the user for first name
        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();

        // Prompt the user for last name
        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        // Concatenate the user's first and last names
        String fullName = firstName + " " + lastName;

        // Print out the user's full name
        System.out.println("Your full name is: " + fullName);
        System.out.println(); // To leave a blank line

        // Get the first character from the user's first name
        char firstInitial = firstName.charAt(0);

        // Print out the user's first initial
        System.out.println("Your first initial is: " + firstInitial);

        // Convert the user's full name to uppercase
        String fullNameUpperCase = fullName.toUpperCase();

        // Print out the user's full name in uppercase
        System.out.println("Your full name in uppercase is: " + fullNameUpperCase);
        System.out.println(); // To leave a blank line

        // Prompt the user for a diameter of a sphere
        System.out.print("Enter the diameter of a sphere: ");
        float diameter = keyboard.nextFloat();

        // Calculate the radius
        double radius = diameter / 2;

        // Calculate the volume
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Print out the volume
        System.out.println("The volume of the sphere is: " + volume);

        // Close the Scanner object
        keyboard.close();
    }
}
