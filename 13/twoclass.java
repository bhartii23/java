
import java.util.Scanner;

class cls1 {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}

class cls2 extends cls1 {
    // Method to print sum and multiplication of two numbers
    public void calculateSumAndProduct(int a, int b) {
        int sum = add(a, b); // Call the add method from cls1
        int product = a * b; // Calculate product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    // Method to print the sum of squares of two numbers
    public void calculateSumOfSquares(int a, int b) {
        int sumOfSquares = (a * a) + (b * b); // (a^2) + (b^2)
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}

public class twoclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        cls2 obj = new cls2(); // Create an instance of cls2
        
        // Call methods from cls2
        obj.calculateSumAndProduct(a, b); // Example inputs: a = 3, b = 4
        obj.calculateSumOfSquares(a, b);
    }
}

