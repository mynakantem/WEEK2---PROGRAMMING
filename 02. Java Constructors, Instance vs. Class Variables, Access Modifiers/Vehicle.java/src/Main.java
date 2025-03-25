// Vehicle class definition
class Vehicle {
    // Instance variables (specific to each vehicle)
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 5000.00; // Fixed initial fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println("--------------------");
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle v1 = new Vehicle("Alice Johnson", "Car");
        Vehicle v2 = new Vehicle("Bob Smith", "Motorcycle");

        // Display details before updating the registration fee
        System.out.println("Before Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(5500.00);

        // Display details after updating the registration fee
        System.out.println("After Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
