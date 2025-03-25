abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - discount;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: $" + price);
        System.out.println("Discount: $" + calculateDiscount());
        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
        System.out.println("Final Price: $" + getFinalPrice());
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18; // 18% tax
    private static final double DISCOUNT_RATE = 0.10; // 10% discount

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Applied: $" + calculateTax() + " (18%)";
    }
}

class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // 5% tax
    private static final double DISCOUNT_RATE = 0.15; // 15% discount

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Applied: $" + calculateTax() + " (5%)";
    }
}

class Groceries extends Product {
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}

import java.util.ArrayList;
import java.util.List;

class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Creating Products
        Electronics laptop = new Electronics(101, "Laptop", 80000);
        Clothing tshirt = new Clothing(102, "T-Shirt", 1500);
        Groceries rice = new Groceries(103, "Rice (5kg)", 500);

        // Adding products to the list
        products.add(laptop);
        products.add(tshirt);
        products.add(rice);

        // Displaying product details with final prices
        for (Product product : products) {
            product.displayDetails();
            System.out.println("---------------------------");
        }
    }
}
