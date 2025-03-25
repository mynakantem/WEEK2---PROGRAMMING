// Person class definition
class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor (clones another Person object)
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an original Person object
        Person original = new Person("Alice", 25);
        System.out.println("Original Person:");
        original.displayDetails();

        System.out.println(); // Line break for clarity

        // Creating a cloned Person object using the copy constructor
        Person cloned = new Person(original);
        System.out.println("Cloned Person:");
        cloned.displayDetails();
    }
}
