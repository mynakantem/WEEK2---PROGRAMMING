// Base class: Studentt
class Studentt {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Studentt(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0.0 && newCGPA <= 10.0) {
            this.CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA! Please enter a value between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Studentt {
    private String researchTopic;

    // Constructor for postgraduate student
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Call superclass constructor
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Public variable
        System.out.println("Name: " + name); // Protected variable (accessible in subclass)
        System.out.println("Research Topic: " + researchTopic);
    }
}

class UniversityManagement {
    public static void main(String[] args) {
        Studentt student1 = new Studentt(101, "Alice Johnson", 8.7);
        student1.displayStudentDetails();

        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println("----------------------------");

        PostgraduateStudent pgStudent = new PostgraduateStudent(202, "Bob Smith", 9.5, "Artificial Intelligence");
        pgStudent.displayPostgraduateDetails();
    }
}
