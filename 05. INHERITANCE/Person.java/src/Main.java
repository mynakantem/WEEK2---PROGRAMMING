class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("This is a person.");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("This is a Teacher. Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("This is a Student. Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("This is a Staff member. Department: " + department);
    }
}
class SchoolSystem {
    public static void main(String[] args) {
        Person teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Person student = new Student("Alice", 15, "10th Grade");
        Person staff = new Staff("John", 30, "Administration");

        // Displaying roles
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
