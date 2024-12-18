import java.util.Scanner;

class OddNumberException extends Exception { 
    // Constructor for custom exception
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    // Method to check if a number is odd
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd!");
        }
        System.out.println("The number " + number + " is even.");
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the user input

        try {
            // Check if the number is even or odd
            checkEven(number);
        } catch (OddNumberException e) {
            // Handle the exception if the number is odd
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
