// Employeee Class
class Employeee {
    // Static variable shared across all employees
    static String companyName = "Tech Solutions Pvt Ltd";

    // Static variable to track the total number of employees
    static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id; // Final variable (cannot be modified)
    private String designation;

    // Constructor using 'this' to initialize values
    public Employeee(String name, int id, String designation) {
        this.name = name; // Resolving ambiguity
        this.id = id;     // Final variable assigned once
        this.designation = designation; // Resolving ambiguity
        totalEmployees++; // Increment employee count
    }

    // Method to display employee details (uses instanceof)
    public void displayEmployeeDetails() {
        if (this instanceof Employeee) { // Checking if object is an instance of Employee
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

// Main class to test the program
class EmployeeManagement {
    public static void main(String[] args) {
        // Display the company name
        System.out.println("Company Name: " + Employeee.companyName);
        System.out.println("-----------------------------");

        // Creating employee objects
        Employeee emp1 = new Employeee("Alice Johnson", 101, "Software Engineer");
        Employeee emp2 = new Employeee("Bob Smith", 102, "Project Manager");

        // Displaying employee details
        emp1.displayEmployeeDetails();
        System.out.println("-----------------------------");
        emp2.displayEmployeeDetails();
        System.out.println("-----------------------------");

        // Displaying total number of employees
        Employeee.displayTotalEmployees();
    }
}
