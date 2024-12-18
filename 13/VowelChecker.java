import java.util.Scanner;

// Custom exception to be thrown when there are no vowels
class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class VowelChecker {

    // Method to check if a string contains vowels
    public static void checkVowels(String input) throws NoVowelException {
        // Check if string contains any vowels (both lowercase and uppercase)
        if (!(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u") || 
              input.contains("A") || input.contains("E") || input.contains("I") || input.contains("O") || input.contains("U"))) {
            throw new NoVowelException("No vowels found in: " + input); // Throw exception if no vowels found
        }
        System.out.println("The string \"" + input + "\" contains vowels."); // Output if vowels are found
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String testString = scanner.nextLine(); // Read the user input string

        try {
            // Call checkVowels method to check for vowels
            checkVowels(testString);
        } catch (NoVowelException e) {
            // Handle the exception if no vowels are found
            System.out.println(e.getMessage());
        }

     
    }
}
