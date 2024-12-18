// Base class ElectronicsProduct
class ElectronicsProduct {
    private int productID;
    private String productName;
    private double price;

    // Constructor to initialize the product attributes
    public ElectronicsProduct(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    // Method to apply a discount
    public void applyDiscount(double discountPercentage) {
        price = price - (price * discountPercentage / 100);
    }

    // Method to calculate the final price after discount
    public double calculateFinalPrice() {
        return price;
    }

    // Getter methods for product details
    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Subclass WashingMachine
class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod; // Warranty period in years

    // Constructor to initialize the washing machine attributes
    public WashingMachine(int productID, String productName, double price, int warrantyPeriod) {
        super(productID, productName, price); // Calling the base class constructor
        this.warrantyPeriod = warrantyPeriod;
    }

    // Method to extend the warranty period
    public void extendWarranty(int additionalYears) {
        warrantyPeriod += additionalYears;
    }

    // Getter method for warranty period
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}

// Main class to test the functionality
public class electronic {
    public static void main(String[] args) {
        // Creating an ElectronicsProduct object
        ElectronicsProduct product = new ElectronicsProduct(101, "Smartphone", 500.0);
        System.out.println("Product: " + product.getProductName());
        System.out.println("Original Price: $" + product.getPrice());
        
        // Applying a discount
        product.applyDiscount(10); // 10% discount
        System.out.println("Price after Discount: $" + product.calculateFinalPrice());

        // Creating a WashingMachine object
        WashingMachine washingMachine = new WashingMachine(102, "Washing Machine", 700.0, 2);
        System.out.println("\nWashing Machine: " + washingMachine.getProductName());
        System.out.println("Original Price: $" + washingMachine.getPrice());
        System.out.println("Warranty Period: " + washingMachine.getWarrantyPeriod() + " years");

        // Extending warranty
        washingMachine.extendWarranty(1); // Extending by 1 year
        System.out.println("Warranty Period after Extension: " + washingMachine.getWarrantyPeriod() + " years");
    }
}

