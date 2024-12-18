import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the value of n
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        // Initialize sum to 0
        int sum = 0;
        
        // Display the first n natural numbers and calculate their sum
        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i; // Add the current number to the sum
        }
        
        // Display the sum of the numbers
        System.out.println("\nSum of the first " + n + " natural numbers: " + sum);
    }
}

