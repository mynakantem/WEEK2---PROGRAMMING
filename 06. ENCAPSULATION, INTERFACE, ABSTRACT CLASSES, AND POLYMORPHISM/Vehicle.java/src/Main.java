// Interface for GPS location tracking
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    // Encapsulation - Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected String getCurrentLocationInternal() {
        return currentLocation;
    }

    protected void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Driver Name  : " + driverName);
        System.out.println("Rate per KM  : ₹" + ratePerKm);
        System.out.println("Location     : " + currentLocation);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}

// Car subclass
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // Base fare for cars
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

// Bike subclass
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // No base fare
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

// Auto subclass
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // Minimal base fare
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

// Main Application
class RideHailingApp {

    // Polymorphic method to handle all types of Vehicles
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println("\n--- Ride Details ---");
        vehicle.getVehicleDetails();
        System.out.println("Distance      : " + distance + " km");
        System.out.println("Total Fare    : ₹" + vehicle.calculateFare(distance));
        System.out.println("----------------------\n");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR001", "Arjun Mehra", 15.0, "Gachibowli");
        Vehicle bike = new Bike("BIKE002", "Reena Das", 7.0, "Madhapur");
        Vehicle auto = new Auto("AUTO003", "Suresh Yadav", 10.0, "Hitech City");

        processRide(car, 12.3);
        processRide(bike, 5.5);
        processRide(auto, 9.2);
    }
}
