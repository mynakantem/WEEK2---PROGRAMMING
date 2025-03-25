// Base class: Employee
class Employee {
    public int employeeID;      // Public: Accessible anywhere
    protected String department; // Protected: Accessible in subclass
    private double salary;      // Private: Only accessible within the class

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to ₹" + newSalary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Public method to get salary (Getter)
    public double getSalary() {
        return salary;
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass: Manager (Inherits from Employee)
class Manager extends Employee {
    private String team; // Additional attribute for Manager

    // Constructor for Manager
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary); // Call superclass constructor
        this.team = team;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Public (Accessible)
        System.out.println("Department: " + department); // Protected (Accessible in subclass)
        System.out.println("Manages Team: " + team);
    }
}

// Main class to test the program
class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "Engineering", 50000);
        emp1.displayEmployeeDetails();
        emp1.setSalary(55000);
        System.out.println("Updated Salary: ₹" + emp1.getSalary());
        System.out.println("----------------------------");

        // Creating a Manager object
        Manager mgr1 = new Manager(201, "IT", 80000, "Development Team");
        mgr1.displayManagerDetails();
    }
}
