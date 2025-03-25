class Item {
    // Attributes
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        // Creating an item object
        Item myItem = new Item("A101", "Wireless Mouse", 25.50);

        // Displaying item details
        myItem.displayDetails();

        // Calculating total cost for a given quantity
        int quantity = 3;
        double totalCost = myItem.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
    }
}
