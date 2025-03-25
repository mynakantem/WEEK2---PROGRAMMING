// Circlee class definition
class Circlee {
    private double radius;

    // Default constructor (calls parameterized constructor with default value)
    public Circlee() {
        this(1.0); // Calls the parameterized constructor with default radius 1.0
    }

    // Parameterized constructor
    public Circlee(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Circlee Details:");
        System.out.println("Radius         : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using the default constructor
        Circlee defaultCirclee = new Circlee();
        defaultCirclee.displayDetails();

        System.out.println(); // Line break for clarity

        // Using the parameterized constructor
        Circlee customCirclee = new Circlee(5.5);
        customCirclee.displayDetails();
    }
}
