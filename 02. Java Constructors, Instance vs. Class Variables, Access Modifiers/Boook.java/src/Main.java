// Book class definition
class Boook {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Boook() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Boook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using the default constructor
        Boook boook1 = new Boook();
        boook1.displayDetails();

        System.out.println(); // Line break for clarity

        // Using the parameterized constructor
        Boook boook2 = new Boook("The Alchemist", "Paulo Coelho", 15.99);
        boook2.displayDetails();
    }
}
