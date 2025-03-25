// Base class: Book
class Bookss {
    public String ISBN;         // Public: Accessible from anywhere
    protected String title;     // Protected: Accessible in the same package and subclasses
    private String author;      // Private: Only accessible within the class

    // Constructor to initialize book details
    public Bookss(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to access the author's name (Getter)
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name (Setter)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook (Inherits from Book)
class EBook extends Bookss {
    private double fileSize; // Additional attribute for EBook

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display EBook details (Accessing protected 'title' and public 'ISBN')
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);  // Public variable (Accessible)
        System.out.println("Title: " + title); // Protected variable (Accessible in subclass)
        System.out.println("File Size: " + fileSize + "MB");
    }
}

// Main class to test the program
class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Bookss bookss1 = new Bookss("978-0134685991", "Effective Java", "Joshua Bloch");
        bookss1.displayBookDetails();

        // Modifying author using setter method
        bookss1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + bookss1.getAuthor());
        System.out.println("----------------------------");

        // Creating an EBook object
        EBook ebook1 = new EBook("978-0596009205", "Head First Java", "Kathy Sierra", 5.2);
        ebook1.displayEBookDetails();
    }
}
