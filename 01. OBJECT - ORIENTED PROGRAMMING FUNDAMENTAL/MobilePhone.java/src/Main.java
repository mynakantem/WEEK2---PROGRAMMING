class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 799.99);

        // Displaying details of each phone
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
