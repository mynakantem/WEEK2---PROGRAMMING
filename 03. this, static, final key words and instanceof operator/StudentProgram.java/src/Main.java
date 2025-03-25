// Student Class
class StudentProgram {
    static String universityName = "Global University";
    static int totalStudents = 0;

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    private final int rollNumber; // Final variable (cannot be changed once assigned)
    private String name;
    private char grade;

    public StudentProgram(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment total students on each new student
    }

    public void updateGrade(char newGrade) {
        if (this instanceof StudentProgram) { // Checking if object is an instance of Student
            this.grade = newGrade;
            System.out.println("Grade updated successfully for " + name);
        }
    }

    public void displayStudentDetails() {
        if (this instanceof StudentProgram) { // Ensuring it's a valid Student object
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

class UniversityStudentManagement {
    public static void main(String[] args) {
        // Display default university name
        System.out.println("University: " + StudentProgram.universityName);
        System.out.println("-----------------------------");

        StudentProgram studentProgram1 = new StudentProgram(101, "Alice", 'A');
        StudentProgram studentProgram2 = new StudentProgram(102, "Bob", 'B');

        studentProgram1.displayStudentDetails();
        System.out.println("-----------------------------");
        studentProgram2.displayStudentDetails();
        System.out.println("-----------------------------");

        studentProgram2.updateGrade('A');
        System.out.println("-----------------------------");

        studentProgram2.displayStudentDetails();
        System.out.println("-----------------------------");

        StudentProgram.displayTotalStudents();
    }
}
