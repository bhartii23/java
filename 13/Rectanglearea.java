import java.util.Scanner;

public class Rectanglearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
