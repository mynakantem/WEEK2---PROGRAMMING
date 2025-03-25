class Vehiclee {
    static double registrationFee = 5000.00;

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehiclee(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehiclee) {
            System.out.println("Vehicle Registration Details:");
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }
}

class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Display initial registration fee
        System.out.println("Default Registration Fee: ₹" + Vehiclee.registrationFee);
        System.out.println("-----------------------------");

        Vehiclee vehiclee1 = new Vehiclee("TN10AB1234", "Alice", "Car");
        Vehiclee vehiclee2 = new Vehiclee("KA05XY5678", "Bob", "Bike");

        vehiclee1.displayVehicleDetails();
        System.out.println("-----------------------------");
        vehiclee2.displayVehicleDetails();
        System.out.println("-----------------------------");

        Vehiclee.updateRegistrationFee(6000.00);
        System.out.println("-----------------------------");

        vehiclee1.displayVehicleDetails();
        System.out.println("-----------------------------");
        vehiclee2.displayVehicleDetails();
    }
}
