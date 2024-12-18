// Base class Shape
abstract class Shape {
    // Abstract methods
    public abstract void draw();  // Method to draw shape
    public abstract double calculateArea();  // Method to calculate area
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override draw method
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    // Override calculateArea method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder class extending Shape
class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override draw method
    public void draw() {
        System.out.println("Drawing a cylinder.");
    }

    // Override calculateArea method
    public double calculateArea() {
        // Total surface area of cylinder: 2πr(r + h)
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Main class
public class Cylinder_area {
    public static void main(String[] args) {
        // Create a Circle and Cylinder object
        Shape circle = new Circle(5);
        Shape cylinder = new Cylinder(5, 10);

        // Call draw and calculateArea for Circle
        System.out.println("Circle:");
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Call draw and calculateArea for Cylinder
        System.out.println("\nCylinder:");
        cylinder.draw();
        System.out.println("Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}

