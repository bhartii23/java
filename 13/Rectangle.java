class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length; // Using 'this' to avoid name space collision
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return this.length * this.width;
    }

    // Getter for length
    public double getLength() {
        return this.length;
    }

    // Getter for width
    public double getWidth() {
        return this.width;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.getArea());

        // Using parameterized constructor 
        Rectangle rect2 = new Rectangle(5, 3);
        System.out.println("\nParameterized Rectangle:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.getArea());
    }
}
