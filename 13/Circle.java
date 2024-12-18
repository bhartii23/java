class Circle {
    private double radius; // Private field for the radius

    // Parameterized constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius; // Using 'this' keyword to avoid name space collision
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return 3.14 * this.radius * this.radius; // Area = πr²
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * 3.14 * this.radius; // Circumference = 2πr
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle circle = new Circle(5); // Create a Circle object with radius 5

        // Display the area and circumference of the circle
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
