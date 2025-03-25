class Productt {
    static double discount = 10.0;

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Productt(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountedPrice = total - (total * (discount / 100));
        return discountedPrice;
    }

    public void displayProductDetails() {
        if (this instanceof Productt) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: $" + calculateTotalPrice());
        }
    }
}

class ShoppingCart {
    public static void main(String[] args) {
        // Display default discount
        System.out.println("Default Discount: " + Productt.discount + "%");
        System.out.println("-----------------------------");

        // Creating product objects
        Productt productt1 = new Productt(101, "Laptop", 1200.00, 1);
        Productt productt2 = new Productt(102, "Smartphone", 800.00, 2);

        productt1.displayProductDetails();
        System.out.println("-----------------------------");
        productt2.displayProductDetails();
        System.out.println("-----------------------------");

        Productt.updateDiscount(15.0); // Modifies discount for all products
        System.out.println("-----------------------------");

        productt1.displayProductDetails();
        System.out.println("-----------------------------");
        productt2.displayProductDetails();
    }
}
