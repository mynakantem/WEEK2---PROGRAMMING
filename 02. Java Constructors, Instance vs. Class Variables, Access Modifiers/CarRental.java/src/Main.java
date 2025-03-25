// CarRental class definition
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 50.0; // Default rate
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("----------------------------");
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Creating rental instances
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 40.0);
        CarRental rental2 = new CarRental("Alice Smith", "Honda Civic", 3, 35.0);

        // Displaying rental details
        rental1.displayRentalDetails();
        rental2.displayRentalDetails();
    }
}
