// Product class definition
class Product {
    // Instance variables (specific to each product)
    private String productName;
    private double price;

    // Class variable (shared across all instances)
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total product count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating product instances
        Product p1 = new Product("Laptop", 850.50);
        Product p2 = new Product("Smartphone", 499.99);
        Product p3 = new Product("Headphones", 79.99);

        // Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total number of products
        Product.displayTotalProducts();
    }
}
