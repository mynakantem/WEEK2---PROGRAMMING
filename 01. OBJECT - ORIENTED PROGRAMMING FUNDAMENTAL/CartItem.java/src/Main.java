import java.util.ArrayList;
import java.util.Scanner;

// Class representing an item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Get total cost of item
    public double getTotalPrice() {
        return price * quantity;
    }
}

// Class representing the Shopping Cart
class ShoppingCart {
    private ArrayList<CartItem> cart;

    // Constructor
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " " + itemName + "(s) added to cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (CartItem item : cart) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                cart.remove(item);
                System.out.println(itemName + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart.");
        }
    }

    // Method to display total cost
    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("\nCart Summary:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - " + item.quantity + " x $" + item.price + " = $" + item.getTotalPrice());
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display cart items
    public void displayCartItems() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\nCurrent Cart Items:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - Quantity: " + item.quantity + ", Price: $" + item.price);
        }
    }
}

// Main class
class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine();
                    cart.removeItem(itemToRemove);
                    break;
                case 3:
                    cart.displayCartItems();
                    break;
                case 4:
                    cart.displayTotalCost();
                    break;
                case 5:
                    System.out.println("Exiting Shopping Cart. Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
