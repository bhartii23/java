import mathoperations.ArithmeticOperations;
import mathoperations.StatisticalOperations;
import mathoperations.TrigonometricOperations;

public class MathPackageDemo {
    public static void main(String[] args) {
        // Arithmetic operations
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        System.out.println("Addition: " + arithmetic.add(5, 3));
        System.out.println("Subtraction: " + arithmetic.subtract(5, 3));

        // Statistical operations
        StatisticalOperations stats = new StatisticalOperations();
        
        // Correct data type for the numbers array
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};      
        System.out.println("Mean: " + stats.mean(numbers));
        System.out.println("Max: " + stats.max(numbers));
        
        // Trigonometric operations
        TrigonometricOperations trig = new TrigonometricOperations();
        System.out.println("Sin of 90 degrees: " + trig.sin(Math.toRadians(90)));
        System.out.println("Cos of 0 degrees: " + trig.cos(Math.toRadians(0)));

    }
}
