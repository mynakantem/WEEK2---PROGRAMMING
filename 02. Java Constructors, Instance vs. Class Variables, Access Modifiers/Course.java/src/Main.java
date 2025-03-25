// Course class definition
class Course {
    // Instance variables (specific to each course)
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable (shared across all courses)
    private static String instituteName = "Global Learning Academy";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("--------------------");
    }

    // Class method to update the institute name (affects all courses)
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating course instances
        Course c1 = new Course("Java Programming", 10, 499.99);
        Course c2 = new Course("Data Science", 12, 699.99);

        // Display details before updating institute name
        System.out.println("Before Institute Name Update:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("Tech Academy");

        // Display details after updating institute name
        System.out.println("After Institute Name Update:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
